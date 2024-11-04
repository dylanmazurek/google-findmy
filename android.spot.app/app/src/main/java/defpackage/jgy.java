package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jgy extends jgf {
    final /* synthetic */ jha a;
    private final Object b;
    private int c;

    public jgy(jha jhaVar, int i) {
        this.a = jhaVar;
        this.b = jhaVar.g(i);
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i != -1 && i < this.a.size() && amr.g(this.b, this.a.g(this.c))) {
            return;
        }
        this.c = this.a.f(this.b);
    }

    @Override // defpackage.jgf, java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.jgf, java.util.Map.Entry
    public final Object getValue() {
        Map n = this.a.n();
        if (n != null) {
            return n.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return this.a.j(i);
    }

    @Override // defpackage.jgf, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map n = this.a.n();
        if (n != null) {
            return n.put(this.b, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            this.a.put(this.b, obj);
            return null;
        }
        jha jhaVar = this.a;
        Object j = jhaVar.j(i);
        jhaVar.t(this.c, obj);
        return j;
    }
}
