package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jnk extends jnb {
    private static final jnw b = new jnw(null);

    public jnk(jow jowVar) {
        super(jowVar);
    }

    @Deprecated
    public static jnk l(String str) {
        jql.f(!str.isEmpty(), "injected class name is empty");
        return new jnk(jpu.d(str.replace('/', '.')));
    }

    @Override // defpackage.jnb
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final jni a(Level level) {
        boolean j = j(level);
        jpu.n(h(), level, j);
        if (!j) {
            return b;
        }
        return new jnj(this, level);
    }
}
