package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class et extends lj {
    public final es a;
    private final dc e;

    /* JADX INFO: Access modifiers changed from: protected */
    public et(bfi bfiVar) {
        dc dcVar = new dc();
        this.e = dcVar;
        es esVar = new es(new ew(this), bfiVar);
        this.a = esVar;
        esVar.c.add(dcVar);
    }

    @Override // defpackage.lj
    public final int a() {
        return this.a.e.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object b(int i) {
        return this.a.e.get(i);
    }

    public final void c(List list) {
        this.a.a(list);
    }
}
