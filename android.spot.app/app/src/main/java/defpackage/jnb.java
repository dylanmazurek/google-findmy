package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jnb {
    public final jow a;

    public jnb(jow jowVar) {
        this.a = jowVar;
    }

    public static void i(String str, jov jovVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(TimeUnit.NANOSECONDS.toMillis(jovVar.e()))));
        sb.append(": logging error [");
        jql.h(1, jovVar.f(), sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public abstract jnx a(Level level);

    public final jnx b() {
        return a(Level.CONFIG);
    }

    public final jnx c() {
        return a(Level.FINE);
    }

    public final jnx d() {
        return a(Level.FINEST);
    }

    public final jnx e() {
        return a(Level.INFO);
    }

    public final jnx f() {
        return a(Level.SEVERE);
    }

    public final jnx g() {
        return a(Level.WARNING);
    }

    public final String h() {
        return this.a.a();
    }

    public final boolean j(Level level) {
        return this.a.d(level);
    }
}
