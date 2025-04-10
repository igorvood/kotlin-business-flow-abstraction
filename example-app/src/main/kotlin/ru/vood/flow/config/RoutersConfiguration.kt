package ru.vood.flow.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import ru.vood.flow.abstraction.router.AbstractWebRouter
import ru.vood.flow.abstraction.router.IHandler
import ru.vood.flow.abstraction.router.enumR.AbstractEnumRouter
import ru.vood.flow.abstraction.router.enumR.IEnumWorker
import ru.vood.flow.abstraction.router.mapper.simple.AbstractMapperRouter
import ru.vood.flow.abstraction.router.mapper.simple.IMapper
import ru.vood.flow.abstraction.router.mapper.mapAndValidate.EitherMapperRouter
import ru.vood.flow.abstraction.router.mapper.mapAndValidate.IValidateMapper
import ru.vood.flow.abstraction.router.mapper.mapAndValidate.IValidateMapperError

@Configuration
class RoutersConfiguration {

    @Bean
    fun asdasdasd(handlers: List<IHandler<*, *>>): AbstractWebRouter {
        val map = handlers.map { it as IHandler<Any, Any> }
        return object : AbstractWebRouter(map) {}
    }


    @Bean
    fun mapperRouterBean(handlers: List<IMapper<*, *>>): AbstractMapperRouter =
        object : AbstractMapperRouter(handlers.map { it as IMapper<Any, Any> }) {}

    @Bean
    fun eitherMapperRouterBean(handlers: List<IValidateMapper<*, *, *>>): EitherMapperRouter =
        EitherMapperRouter(handlers.map { it as IValidateMapper<Any, Any, IValidateMapperError> })


    @Bean
    fun abstractEnumRouterBean(handlers: List<IEnumWorker<INEnumRouterData, OutEnumRouterData, SomeEnum>>): AbstractEnumRouter<INEnumRouterData, OutEnumRouterData, SomeEnum> {
        val value =
            object : AbstractEnumRouter<INEnumRouterData, OutEnumRouterData, SomeEnum>(handlers, SomeEnum.entries) {}
        return value
    }


}