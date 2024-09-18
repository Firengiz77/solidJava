package com.solid.liskovSubstitution;

public class Book implements DoSomething {
    @Override
    public void doSomething() {

    }

    @Override
    public void doSomethingElse() {
           throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void openBook() {

    }
}
