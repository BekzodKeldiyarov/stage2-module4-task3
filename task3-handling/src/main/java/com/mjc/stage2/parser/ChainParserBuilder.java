package com.mjc.stage2.parser;

import java.util.ArrayList;
import java.util.List;

public class ChainParserBuilder {
    private List<AbstractTextParser> parsers = new ArrayList<>();

    public ChainParserBuilder() {
    }

    public ChainParserBuilder setParser(AbstractTextParser abstractTextParser) {
        this.parsers.add(abstractTextParser);
        return this;
    }

    public AbstractTextParser build() {
        // Write your code here!
        AbstractTextParser abstractTextParser = null;
        if (!parsers.isEmpty()) {
            abstractTextParser = parsers.get(0);
            for (int i = 1; i < parsers.size(); i++) {
                parsers.get(i - 1).setNextParser(parsers.get(i));
            }
        }
        return abstractTextParser;
    }
}
