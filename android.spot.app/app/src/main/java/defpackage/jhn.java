package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhn extends jit {
    public static final jhn a = new jhn();
    private static final long serialVersionUID = 0;

    private jhn() {
        super(jmn.a, 0);
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.jjm, defpackage.jgh, defpackage.jls
    public final /* synthetic */ Map q() {
        return this.map;
    }
}
