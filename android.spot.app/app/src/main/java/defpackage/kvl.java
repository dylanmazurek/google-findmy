package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvl extends lyt {
    private final String a;
    private final ktl b;
    private final Object c = new Object();
    private final ConcurrentHashMap d = new ConcurrentHashMap();

    public kvl(String str, ktl ktlVar) {
        this.a = str;
        this.b = ktlVar;
    }

    private static final URI c(String str) {
        try {
            URI uri = new URI(null, str, null, null, null);
            if (uri.getPort() != -1) {
                return uri;
            }
            return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), 443, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e) {
            throw new IllegalStateException("Malformed endpoint authority", e);
        }
    }

    @Override // defpackage.lyt
    public final lyv a(mbg mbgVar, lys lysVar) {
        Object obj;
        Context context;
        URI uri;
        Executor executor;
        Executor executor2;
        jfe jfeVar;
        kvl kvlVar = this;
        String str = (String) lysVar.e(ktq.a);
        ktl ktlVar = kvlVar.b;
        if (str == null) {
            str = kvlVar.a;
        }
        URI c = c(str);
        hwx.V(!TextUtils.isEmpty(c.getAuthority()), "Could not parse channel authority");
        Integer num = (Integer) lysVar.e(kwi.a);
        Integer num2 = (Integer) lysVar.e(kwi.b);
        long longValue = ((Long) ((jfh) kvlVar.b.j).a).longValue();
        ktl ktlVar2 = kvlVar.b;
        kvk kvkVar = new kvk(c, longValue, ktlVar2.l, ktlVar2.m, num, num2);
        kvj kvjVar = (kvj) kvlVar.d.get(kvkVar);
        if (kvjVar == null) {
            Object obj2 = kvlVar.c;
            synchronized (obj2) {
                try {
                    try {
                        if (!kvlVar.d.containsKey(kvkVar)) {
                            jfh jfhVar = new jfh(false);
                            ktr ktrVar = new ktr();
                            ktrVar.d(jfhVar);
                            ktrVar.c(4194304);
                            ktrVar.a(Long.MAX_VALUE);
                            ktrVar.b(kts.a);
                            Context context2 = ktlVar.a;
                            if (context2 != null) {
                                ktrVar.a = context2;
                                ktrVar.b = kvkVar.a;
                                ktrVar.g = kvkVar.c;
                                ktrVar.h = kvkVar.d;
                                ktrVar.i = kvkVar.b;
                                ktrVar.m = (byte) (ktrVar.m | 1);
                                Executor executor3 = ktlVar.d;
                                if (executor3 != null) {
                                    ktrVar.c = executor3;
                                    Executor executor4 = ktlVar.b;
                                    if (executor4 != null) {
                                        ktrVar.d = executor4;
                                        ktrVar.e = ktlVar.e;
                                        ktrVar.d(ktlVar.g);
                                        ktrVar.c(ktlVar.k);
                                        ktrVar.a(ktlVar.l);
                                        ktrVar.b(ktlVar.m);
                                        if (ktrVar.m == 15 && (context = ktrVar.a) != null && (uri = ktrVar.b) != null && (executor = ktrVar.c) != null && (executor2 = ktrVar.d) != null && (jfeVar = ktrVar.f) != null) {
                                            try {
                                                obj = obj2;
                                                try {
                                                    kvlVar = this;
                                                    kvlVar.d.put(kvkVar, new kvj(ktlVar.n, new kts(context, uri, executor, executor2, ktrVar.e, jfeVar, ktrVar.g, ktrVar.h, ktrVar.i, ktrVar.j, ktrVar.k, ktrVar.l), ktlVar.c));
                                                } catch (Throwable th) {
                                                    th = th;
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                obj = obj2;
                                                throw th;
                                            }
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        if (ktrVar.a == null) {
                                            sb.append(" applicationContext");
                                        }
                                        if (ktrVar.b == null) {
                                            sb.append(" uri");
                                        }
                                        if (ktrVar.c == null) {
                                            sb.append(" networkExecutor");
                                        }
                                        if (ktrVar.d == null) {
                                            sb.append(" transportExecutor");
                                        }
                                        if (ktrVar.f == null) {
                                            sb.append(" recordNetworkMetricsToPrimes");
                                        }
                                        if ((ktrVar.m & 1) == 0) {
                                            sb.append(" grpcIdleTimeoutMillis");
                                        }
                                        if ((ktrVar.m & 2) == 0) {
                                            sb.append(" maxMessageSize");
                                        }
                                        if ((ktrVar.m & 4) == 0) {
                                            sb.append(" grpcKeepAliveTimeMillis");
                                        }
                                        if ((ktrVar.m & 8) == 0) {
                                            sb.append(" grpcKeepAliveTimeoutMillis");
                                        }
                                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                                    }
                                    throw new NullPointerException("Null transportExecutor");
                                }
                                throw new NullPointerException("Null networkExecutor");
                            }
                            throw new NullPointerException("Null applicationContext");
                        }
                        obj = obj2;
                        kvjVar = (kvj) kvlVar.d.get(kvkVar);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        return kvjVar.a(mbgVar, lysVar);
    }

    @Override // defpackage.lyt
    public final String b() {
        return this.a;
    }
}
