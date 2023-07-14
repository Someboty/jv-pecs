package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineProducer<E> {
    int LIST_SIZE = 3;

    List<? extends Machine> get();
}
