package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akq extends ako {
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        this.b = i + 2;
        return this.a[i];
    }
}
