package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class es {
    private static final Executor h = new qp(1, (byte[]) null);
    public final ff a;
    public List d;
    public int f;
    final bfi g;
    public final List c = new CopyOnWriteArrayList();
    public List e = Collections.emptyList();
    public final Executor b = h;

    public es(ff ffVar, bfi bfiVar) {
        this.a = ffVar;
        this.g = bfiVar;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void a(List list) {
        int i = this.f + 1;
        this.f = i;
        List list2 = this.d;
        if (list == list2) {
            return;
        }
        if (list == null) {
            int size = list2.size();
            this.d = null;
            this.e = Collections.emptyList();
            this.a.b(0, size);
            b();
            return;
        }
        if (list2 == null) {
            this.d = list;
            this.e = DesugarCollections.unmodifiableList(list);
            this.a.a(0, list.size());
            b();
            return;
        }
        bfi bfiVar = this.g;
        bfiVar.b.execute(new gzi(this, list2, list, i, 1));
    }

    public final void b() {
        for (dc dcVar : this.c) {
        }
    }
}
