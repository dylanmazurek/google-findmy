package defpackage;

import android.R;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htl {
    public final short[] a;
    public final short[] b;
    public final int c;
    public long d;

    public htl(Random random) {
        hwx.J(true);
        this.a = new short[256];
        this.b = new short[256];
        this.c = (random.nextInt() & (-33686019)) | R.attr.cacheColorHint;
        this.d = 0L;
    }
}
