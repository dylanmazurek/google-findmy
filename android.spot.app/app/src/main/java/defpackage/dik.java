package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dik extends IOException {
    private static final long serialVersionUID = 1;

    public dik(String str, int i) {
        this(str, i, null);
    }

    public dik(String str, int i, Throwable th) {
        super(str + ", status code: " + i, th);
    }
}
