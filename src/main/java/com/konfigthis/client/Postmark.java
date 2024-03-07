package com.konfigthis.client;

import com.konfigthis.client.api.BouncesApiApi;
import com.konfigthis.client.api.InboundRulesApiApi;
import com.konfigthis.client.api.MessagesApiApi;
import com.konfigthis.client.api.SendingApiApi;
import com.konfigthis.client.api.ServerConfigurationApiApi;
import com.konfigthis.client.api.StatsApiApi;
import com.konfigthis.client.api.TemplatesApiApi;

public class Postmark {
    private ApiClient apiClient;
    public final BouncesApiApi bouncesApi;
    public final InboundRulesApiApi inboundRulesApi;
    public final MessagesApiApi messagesApi;
    public final SendingApiApi sendingApi;
    public final ServerConfigurationApiApi serverConfigurationApi;
    public final StatsApiApi statsApi;
    public final TemplatesApiApi templatesApi;

    public Postmark() {
        this(null);
    }

    public Postmark(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.bouncesApi = new BouncesApiApi(this.apiClient);
        this.inboundRulesApi = new InboundRulesApiApi(this.apiClient);
        this.messagesApi = new MessagesApiApi(this.apiClient);
        this.sendingApi = new SendingApiApi(this.apiClient);
        this.serverConfigurationApi = new ServerConfigurationApiApi(this.apiClient);
        this.statsApi = new StatsApiApi(this.apiClient);
        this.templatesApi = new TemplatesApiApi(this.apiClient);
    }

}
