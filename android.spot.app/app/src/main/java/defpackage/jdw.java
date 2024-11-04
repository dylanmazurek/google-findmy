package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jdw extends jeb {
    final jeb b;

    public jdw(jeb jebVar) {
        this.b = jebVar;
    }

    @Override // defpackage.jeb
    public final void b(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        this.b.b(bitSet2);
        bitSet2.flip(0, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
        bitSet.or(bitSet2);
    }

    @Override // defpackage.jeb
    public final boolean c(char c) {
        if (!this.b.c(c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jeb
    public final boolean f(CharSequence charSequence) {
        return this.b.g(charSequence);
    }

    @Override // defpackage.jeb
    public final boolean g(CharSequence charSequence) {
        return this.b.f(charSequence);
    }

    public String toString() {
        return this.b.toString().concat(".negate()");
    }
}
