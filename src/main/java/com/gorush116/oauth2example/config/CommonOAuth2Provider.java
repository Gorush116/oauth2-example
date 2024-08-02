package com.gorush116.oauth2example.config;

import lombok.Builder;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;

public enum CommonOAuth2Provider {
    GITHUB {
//        @Override
//        public Builder getBuilder(String registrationId) {
//            ClientRegistration.Builder builder = getBuilder(registrationId,
//                    ClientAuthenticationMethod.CLIENT_SECRET_BASIC, DEFAULT_REDIRECT_URL);
//            builder.scope("read:user");
//            builder.authorizationUri("https://github.com/login/oauth/authorize");
//            builder.tokenUri("https://github.com/login/oauth/access_token");
//            builder.userInfoUri("https://api.github.com/user");
//            builder.userNameAttributeName("id");
//            builder.clientName("GitHub");
//            return builder;
//        }
    }
}
