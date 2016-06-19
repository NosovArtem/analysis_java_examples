package com.company.Patterns.State.start;

import com.company.Patterns.State.context.TransformerContext;
import com.company.Patterns.State.state.FireState;
import com.company.Patterns.State.state.MoveState;
import com.company.Patterns.State.state.TransformerState;

public class Main {

    public static void main(String[] args) {

        TransformerContext context = new TransformerContext();
        
        TransformerState stateMove = new MoveState();
        TransformerState stateFire = new FireState();

        context.setState(stateFire);
        context.action();

        context.setState(stateMove);
        context.action();
        
    }
}
