package ru.vood.flow.config.enumR

import org.springframework.stereotype.Service
import ru.vood.flow.abstraction.router.abstraction.IWorker
import ru.vood.flow.abstraction.router.enumR.AbstractEnumRouter
import ru.vood.flow.abstraction.router.enumR.EnumWorkerId

@Service
class SomeEnumRouter(
    iWorkerList: List<IWorker<INEnumRouterData, OutEnumRouterData, EnumWorkerId<SomeEnum>>>) : AbstractEnumRouter<INEnumRouterData, OutEnumRouterData, SomeEnum>(
    iWorkerList,
    SomeEnum.entries
) {
}