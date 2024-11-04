package j$.util.stream;

import java.util.Comparator;

/* loaded from: classes2.dex */
abstract class G0 extends C0 {
    protected final Comparator b;
    protected boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G0(F0 f0, Comparator comparator) {
        super(f0);
        this.b = comparator;
    }

    @Override // j$.util.stream.C0, j$.util.stream.F0
    public final boolean n() {
        this.c = true;
        return false;
    }
}
