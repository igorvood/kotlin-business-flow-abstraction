package ru.vood.flow.abstraction.router.enumR

import ru.vood.flow.abstraction.router.abstraction.IWorkerId

data class OnlyEnumId<E : Enum<E>
//        out T : Any, out R : Any
        >(
    val emun: E
//    override val tkClass: KClass<out T>,
//    override val rkClass: KClass<out R>
) : IWorkerId
