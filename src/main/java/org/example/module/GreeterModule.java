package org.example.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import org.example.annotation.Count;
import org.example.annotation.Message;

public class GreeterModule extends AbstractModule {
    @Provides
    @Count
    static Integer provideCount() {
        return 3;
    }

    @Provides
    @Message
    static String provideMessage() {
        return "hello world";
    }


    @Override
    protected void configure() {
        // No class bindings are defined in this configure() method
        // because we're using primitive types handled by @Provides methods.
        // Typically, if we had class-to-class bindings, they would be defined here, like this:
        // bind(CreditCardProcessor.class).to(PayPalCreditCardProcessor.class);
        // bind(BillingService.class).to(RealBillingService.class);
    }
}
