package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class en extends ek {
    public int[][] K;

    public en(en enVar, eo eoVar, Resources resources) {
        super(enVar, eoVar, resources);
        if (enVar != null) {
            this.K = enVar.K;
        } else {
            this.K = new int[this.i.length];
        }
    }

    @Override // defpackage.ek
    public void d() {
        int[] iArr;
        int length = this.K.length;
        int[][] iArr2 = new int[length];
        while (true) {
            length--;
            if (length >= 0) {
                int[] iArr3 = this.K[length];
                if (iArr3 != null) {
                    iArr = (int[]) iArr3.clone();
                } else {
                    iArr = null;
                }
                iArr2[length] = iArr;
            } else {
                this.K = iArr2;
                return;
            }
        }
    }

    @Override // defpackage.ek
    public final void j(int i, int i2) {
        Drawable[] drawableArr = new Drawable[i2];
        Drawable[] drawableArr2 = this.i;
        if (drawableArr2 != null) {
            System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
        }
        this.i = drawableArr;
        int[][] iArr = new int[i2];
        System.arraycopy(this.K, 0, iArr, 0, i);
        this.K = iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int m(int[] iArr) {
        int[][] iArr2 = this.K;
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new eo(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new eo(this, resources);
    }
}
