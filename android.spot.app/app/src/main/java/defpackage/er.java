package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class er extends ey {
    final /* synthetic */ gzi a;

    public er(gzi gziVar) {
        this.a = gziVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.ey
    public final int a() {
        return this.a.c.size();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.ey
    public final int b() {
        return this.a.d.size();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.ey
    public final boolean c(int i, int i2) {
        ?? r0 = this.a.c;
        Object obj = this.a.d.get(i);
        Object obj2 = r0.get(i2);
        if (obj != null && obj2 != null) {
            return ((fa) ((es) this.a.b).g.a).a(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.ey
    public final boolean d(int i, int i2) {
        ?? r0 = this.a.c;
        Object obj = this.a.d.get(i);
        Object obj2 = r0.get(i2);
        if (obj != null && obj2 != null) {
            return ((fa) ((es) this.a.b).g.a).b(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.ey
    public final void e(int i, int i2) {
        ?? r0 = this.a.c;
        Object obj = this.a.d.get(i);
        Object obj2 = r0.get(i2);
        if (obj != null && obj2 != null) {
        } else {
            throw new AssertionError();
        }
    }
}
