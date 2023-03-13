package com.mjc.stage2.entity;

import com.mjc.stage2.parser.AbstractTextParser;

public class SymbolLeaf extends AbstractTextComponent {

    private char value;

    // Write your code here!


    public SymbolLeaf(TextComponentType componentType) {
        super(componentType);
    }

    public SymbolLeaf(TextComponentType componentType, char value) {
        super(componentType);
        this.value = value;
    }

    @Override
    public String operation() {
        return String.valueOf(value);
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getSize() {
        return 0;
    }
}
