package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dna implements dnq {
    private final /* synthetic */ int a;
    private final Object b;

    public dna(int i, byte[] bArr) {
        this.a = i;
        this.b = new bpz();
    }

    @Override // defpackage.dnq
    public final dnp b(dnu dnuVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return new dmz((Context) this.b, dnuVar.a(Integer.class, InputStream.class), 3);
                }
                return new dmz((Context) this.b, dnuVar.a(Integer.class, AssetFileDescriptor.class), 3);
            }
            return new dnt(1);
        }
        return new dne(this.b, 0);
    }

    public dna(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
