package ru.vood.flow.abstraction.router.mapper.mapAndValidate

import ru.vood.flow.abstraction.router.abstraction.IWorkerId
import ru.vood.flow.abstraction.router.abstraction.byInOutClass.IWorkerIdByInOutClass
import kotlin.reflect.KClass


data class ValidateMapperId<out T : Any, out R : Any>(
    val tkClass: KClass<out T>,
    val rkClass: KClass<out R>
) : IWorkerId
