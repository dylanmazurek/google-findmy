package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mrg implements mqz {
    public final Object a;
    public final Object b;
    private final /* synthetic */ int c;

    public mrg(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    @Override // defpackage.mqz
    public final Iterator a() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                return new mri(this);
            }
            return new mqy(this);
        }
        return new mrf(this);
    }

    public mrg(mqz mqzVar, moh mohVar, int i) {
        this.c = i;
        this.a = mqzVar;
        this.b = mohVar;
    }
}
