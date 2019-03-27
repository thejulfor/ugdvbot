module ultimategdbot.core {
	requires transitive ultimategdbot.api;
	requires org.reactivestreams;
	requires reactor.core;
	requires transitive org.hibernate.orm.core;
	requires java.persistence;
	requires java.naming;
	requires java.sql;
	requires discord4j.rest;
	requires discord4j.gateway;
	requires org.hibernate.orm.ehcache;
	requires io.netty.codec.http;
	requires org.slf4j;
	
	exports com.github.alex1304.ultimategdbot.core;

	provides com.github.alex1304.ultimategdbot.api.Plugin with com.github.alex1304.ultimategdbot.core.NativePlugin;
	
	uses com.github.alex1304.ultimategdbot.api.Plugin;
}