package org.example.custom;

import org.springframework.context.annotation.ScopeMetadata;
import org.springframework.context.annotation.ScopeMetadataResolver;
import org.springframework.beans.factory.config.BeanDefinition;

public class CustomScope implements ScopeMetadataResolver {
    public CustomScope(){}

    @Override
    public ScopeMetadata resolveScopeMetadata(BeanDefinition bd) {
        ScopeMetadata scopeMetadata = new ScopeMetadata();


        // Add custom logic here. For example, set the bean as a prototype if its name starts with "custom":
        if(bd.getBeanClassName().equals("org.example.CustomClass")){
            System.out.println("here in "+bd.getBeanClassName());
            scopeMetadata.setScopeName(BeanDefinition.SCOPE_PROTOTYPE);
            System.out.println(scopeMetadata.getScopeName());
            return scopeMetadata;
        } else {
            scopeMetadata.setScopeName("singleton");
        }

        return scopeMetadata;
    }
}
