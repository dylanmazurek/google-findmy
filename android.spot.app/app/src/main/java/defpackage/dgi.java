package defpackage;

import j$.util.DesugarCollections;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgi {
    public final int a;
    public final int b;
    public final InputStream c;
    private final List d;

    public dgi(int i, List list, int i2, InputStream inputStream) {
        this.a = i;
        this.d = list;
        this.b = i2;
        this.c = inputStream;
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(this.d);
    }
}
