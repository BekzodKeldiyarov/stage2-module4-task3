package com.mjc.stage2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TextComponent extends AbstractTextComponent {
    protected List<AbstractTextComponent> componentList = new ArrayList<>();
    private int size = 0;
// Write your code here!


    public TextComponent(TextComponentType componentType) {
        super(componentType);
    }

    @Override
    public String operation() {
        return componentList.stream()
                .map(AbstractTextComponent::operation)
                .collect(Collectors.joining(""));
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        this.componentList.add(textComponent);
        size = textComponent.getSize();
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        this.componentList.remove(textComponent);
        size--;
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
