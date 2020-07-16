package com.example.zoomintegrationapp.initsdk

interface AuthConstants {
    companion object {
        // TODO Change it to your web domain
        const val WEB_DOMAIN = "zoom.us"

        //These keys must be fetched from server and not hardcoded
        // TODO Change it to your APP Key
        const val APP_KEY = "InlfYluaNBiYnaLPYHwI9cVppKAN5vlMr4aq"

        // TODO Change it to your APP Secret
        const val APP_SECRET = "Z3dQMoQ5JJv3L0NTE3lMQwZiL8NTEXWzptzn"
        /**
         * We recommend that, you can generate jwttoken on your own server instead of hardcore in the code.
         * We hardcore it here, just to run the demo.
         *
         * You can generate a jwttoken on the https://jwt.io/
         * with this payload:
         * {
         * "appKey": "string", // app key
         * "iat": long, // access token issue timestamp
         * "exp": long, // access token expire time
         * "tokenExp": long // token expire time
         * }
         */
        //public final static String SDK_JWTTOKEN = YOUR JWTTOKEN;
    }
}