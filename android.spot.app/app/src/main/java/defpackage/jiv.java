package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jiv extends jja {
    final /* synthetic */ jiw a;

    public jiv(jiw jiwVar) {
        this.a = jiwVar;
    }

    @Override // defpackage.jjr, defpackage.jih, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final jmw listIterator() {
        return this.a.a();
    }

    @Override // defpackage.jja
    public final jiy h() {
        return this.a;
    }

    @Override // defpackage.jja, defpackage.jjr, defpackage.jih
    public Object writeReplace() {
        return super.writeReplace();
    }
}
