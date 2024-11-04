package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fg implements Comparator, ff {
    public final lj a;

    public fg() {
        throw null;
    }

    @Override // defpackage.ff
    public final void a(int i, int i2) {
        throw null;
    }

    @Override // defpackage.ff
    public final void b(int i, int i2) {
        this.a.i(i, i2);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((Integer) obj).compareTo((Integer) obj2);
    }

    public fg(lj ljVar) {
        this.a = ljVar;
    }
}
