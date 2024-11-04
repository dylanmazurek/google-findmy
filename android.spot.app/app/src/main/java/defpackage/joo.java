package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class joo extends jom {
    public joo(jow jowVar) {
        super(jowVar);
    }

    public static joo m(String str) {
        return new joo(jpu.d(str));
    }

    @Override // defpackage.jnb
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final jol a(Level level) {
        boolean j = j(level);
        jpu.n(h(), level, j);
        if (!j) {
            return b;
        }
        return new jon(this, level);
    }
}
