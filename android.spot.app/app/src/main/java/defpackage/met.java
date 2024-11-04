package defpackage;

import j$.util.DesugarCollections;
import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class met extends mbn {
    public static final Logger a;
    public static final Set b;
    static final boolean c;
    static final boolean d;
    protected static final boolean e;
    public static final mes f;
    private static final String s;
    private static final String t;
    private static final String u;
    private static String v;
    private final boolean A;
    private mbk B;
    final mbu g;
    public final String j;
    public final int k;
    public final long l;
    public final mcf m;
    public final jfd n;
    public boolean o;
    public final mbm p;
    public boolean q;
    private final String w;
    private final mjq x;
    private boolean y;
    private Executor z;
    public final Random h = new Random();
    protected volatile int r = 1;
    public final AtomicReference i = new AtomicReference();

    static {
        Logger logger = Logger.getLogger(met.class.getName());
        a = logger;
        b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        s = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        t = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        u = property3;
        c = Boolean.parseBoolean(property);
        d = Boolean.parseBoolean(property2);
        e = Boolean.parseBoolean(property3);
        mes mesVar = null;
        try {
            try {
                try {
                    mes mesVar2 = (mes) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, met.class.getClassLoader()).asSubclass(mes.class).getConstructor(null).newInstance(null);
                    if (mesVar2.b() != null) {
                        logger.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", mesVar2.b());
                    } else {
                        mesVar = mesVar2;
                    }
                } catch (Exception e2) {
                    a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e2);
                }
            } catch (Exception e3) {
                a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e3);
            }
        } catch (ClassCastException e4) {
            a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e4);
        } catch (ClassNotFoundException e5) {
            a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e5);
        }
        f = mesVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public met(String str, mbh mbhVar, mjq mjqVar, jfd jfdVar, boolean z) {
        boolean z2;
        mbhVar.getClass();
        this.x = mjqVar;
        str.getClass();
        URI create = URI.create("//".concat(str));
        if (create.getHost() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        hwx.O(z2, "Invalid DNS name: %s", str);
        String authority = create.getAuthority();
        authority.getClass();
        this.w = authority;
        this.j = create.getHost();
        if (create.getPort() == -1) {
            this.k = 443;
        } else {
            this.k = create.getPort();
        }
        this.g = mbhVar.a;
        long j = 0;
        if (!z) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j2 = 30;
            if (property != null) {
                try {
                    j2 = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    a.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            if (j2 > 0) {
                j = TimeUnit.SECONDS.toNanos(j2);
            } else {
                j = j2;
            }
        }
        this.l = j;
        this.n = jfdVar;
        this.m = mbhVar.b;
        Executor executor = mbhVar.e;
        this.z = executor;
        this.A = executor == null;
        this.p = mbhVar.c;
    }

    public static String e() {
        if (v == null) {
            try {
                v = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e2) {
                throw new RuntimeException(e2);
            }
        }
        return v;
    }

    private final void f() {
        if (!this.q && !this.y) {
            if (this.o) {
                long j = this.l;
                if (j != 0 && (j <= 0 || this.n.a(TimeUnit.NANOSECONDS) <= this.l)) {
                    return;
                }
            }
            this.q = true;
            this.z.execute(new meq(this, this.B));
        }
    }

    @Override // defpackage.mbn
    public final String a() {
        return this.w;
    }

    @Override // defpackage.mbn
    public final void b() {
        boolean z;
        if (this.B != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "not started");
        f();
    }

    @Override // defpackage.mbn
    public final void c() {
        if (!this.y) {
            this.y = true;
            Executor executor = this.z;
            if (executor != null && this.A) {
                mjr.d(this.x, executor);
                this.z = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.mbn
    public final void d(mbk mbkVar) {
        boolean z;
        if (this.B == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "already started");
        if (this.A) {
            this.z = mjr.a(this.x);
        }
        this.B = mbkVar;
        f();
    }
}
