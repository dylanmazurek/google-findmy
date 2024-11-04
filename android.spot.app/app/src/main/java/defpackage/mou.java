package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mou implements Serializable {
    public static final mou a = new mou();

    private Object readResolve() {
        return a;
    }
}
