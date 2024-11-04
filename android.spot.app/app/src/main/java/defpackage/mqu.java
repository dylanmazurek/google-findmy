package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mqu implements mqz {
    public final mqz a;
    public final int b;

    public mqu(mqz mqzVar, int i) {
        this.a = mqzVar;
        this.b = i;
    }

    @Override // defpackage.mqz
    public final Iterator a() {
        return new mqt(this, 0);
    }
}
