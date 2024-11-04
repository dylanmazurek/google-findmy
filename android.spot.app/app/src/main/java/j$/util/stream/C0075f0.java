package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0075f0 extends AbstractC0077g0 {
    private final Object[] h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0075f0(Spliterator spliterator, AbstractC0064a abstractC0064a, Object[] objArr) {
        super(spliterator, abstractC0064a, objArr.length);
        this.h = objArr;
    }

    @Override // j$.util.stream.AbstractC0077g0
    final AbstractC0077g0 a(Spliterator spliterator, long j, long j2) {
        return new C0075f0(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f;
        if (i < this.g) {
            Object[] objArr = this.h;
            this.f = i + 1;
            objArr[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f));
    }

    C0075f0(C0075f0 c0075f0, Spliterator spliterator, long j, long j2) {
        super(c0075f0, spliterator, j, j2, c0075f0.h.length);
        this.h = c0075f0.h;
    }
}
