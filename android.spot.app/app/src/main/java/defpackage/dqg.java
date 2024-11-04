package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqg implements dlf {
    private final /* synthetic */ int a;
    private final Object b;

    public dqg(Bitmap bitmap, int i) {
        this.a = i;
        this.b = bitmap;
    }

    @Override // defpackage.dlf
    public final int a() {
        int intrinsicWidth;
        int intrinsicHeight;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                Object obj = this.b;
                intrinsicWidth = he$$ExternalSyntheticApiModelOutline0.m124m(obj).getIntrinsicWidth();
                intrinsicHeight = he$$ExternalSyntheticApiModelOutline0.m124m(obj).getIntrinsicHeight();
                int b = intrinsicWidth * intrinsicHeight * dtq.b(Bitmap.Config.ARGB_8888);
                return b + b;
            }
            return dtq.a((Bitmap) this.b);
        }
        return ((byte[]) this.b).length;
    }

    @Override // defpackage.dlf
    public final Class b() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return Drawable.class;
            }
            return Bitmap.class;
        }
        return byte[].class;
    }

    @Override // defpackage.dlf
    public final /* synthetic */ Object c() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return this.b;
            }
            return this.b;
        }
        return this.b;
    }

    @Override // defpackage.dlf
    public final void e() {
        int i = this.a;
        if (i == 0 || i == 1) {
            return;
        }
        he$$ExternalSyntheticApiModelOutline0.m124m(this.b).stop();
        he$$ExternalSyntheticApiModelOutline0.m124m(this.b).clearAnimationCallbacks();
    }

    public dqg(AnimatedImageDrawable animatedImageDrawable, int i) {
        this.a = i;
        this.b = animatedImageDrawable;
    }

    public dqg(byte[] bArr, int i) {
        this.a = i;
        bsc.q(bArr);
        this.b = bArr;
    }
}
