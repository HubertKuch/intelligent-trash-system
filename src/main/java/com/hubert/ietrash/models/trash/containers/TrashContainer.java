package com.hubert.ietrash.models.trash.containers;

public interface TrashContainer {
    void open();
    void close();
    void isOpen();

    ContainerDestiny getType();
}
