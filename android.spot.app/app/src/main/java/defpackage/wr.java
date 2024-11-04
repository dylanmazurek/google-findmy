package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wr implements vb {
    private final /* synthetic */ int a;
    private final Object b;

    public wr(va vaVar, float f, float f2, int i) {
        this.a = i;
        mqg ak = moz.ak(0, vaVar.b());
        ArrayList arrayList = new ArrayList(mkm.ap(ak));
        mmb it = ak.iterator();
        while (it.a) {
            arrayList.add(new vl(f, f2, vaVar.a(it.a())));
        }
        this.b = arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [vk, java.lang.Object] */
    @Override // defpackage.vb
    public final /* synthetic */ vk a(int i) {
        if (this.a != 0) {
            return (vl) this.b.get(i);
        }
        return this.b;
    }

    public wr(float f, float f2, int i) {
        this.a = i;
        this.b = new vl(f, f2, 4);
    }
}
