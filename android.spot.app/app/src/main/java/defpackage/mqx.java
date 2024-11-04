package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mqx implements mqz {
    public final mqz a;
    public final boolean b;
    public final moh c;

    public mqx(mqz mqzVar, boolean z, moh mohVar) {
        this.a = mqzVar;
        this.b = z;
        this.c = mohVar;
    }

    @Override // defpackage.mqz
    public final Iterator a() {
        return new mqw(this);
    }
}
