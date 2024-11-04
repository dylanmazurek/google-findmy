package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aks extends ako {
    private final akb c;

    public aks(akb akbVar) {
        this.c = akbVar;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 2;
        Object[] objArr = this.a;
        return new ajv(this.c, objArr[i], objArr[i + 1]);
    }
}
