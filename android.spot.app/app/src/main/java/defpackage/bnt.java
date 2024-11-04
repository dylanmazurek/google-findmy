package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bnt extends bom {
    private bmz a;

    public bnt(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bom, defpackage.bnv
    public final void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.a = new bmz();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, bol.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.a.aG = obtainStyledAttributes.getInt(0, 0);
                } else if (index == 1) {
                    bmz bmzVar = this.a;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
                    bmzVar.aL = dimensionPixelSize;
                    bmzVar.aM = dimensionPixelSize;
                    bmzVar.aN = dimensionPixelSize;
                    bmzVar.aO = dimensionPixelSize;
                } else if (index == 18) {
                    bmz bmzVar2 = this.a;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(18, 0);
                    bmzVar2.aN = dimensionPixelSize2;
                    bmzVar2.aP = dimensionPixelSize2;
                    bmzVar2.aQ = dimensionPixelSize2;
                } else if (index == 19) {
                    this.a.aO = obtainStyledAttributes.getDimensionPixelSize(19, 0);
                } else if (index == 2) {
                    this.a.aP = obtainStyledAttributes.getDimensionPixelSize(2, 0);
                } else if (index == 3) {
                    this.a.aL = obtainStyledAttributes.getDimensionPixelSize(3, 0);
                } else if (index == 4) {
                    this.a.aQ = obtainStyledAttributes.getDimensionPixelSize(4, 0);
                } else if (index == 5) {
                    this.a.aM = obtainStyledAttributes.getDimensionPixelSize(5, 0);
                } else if (index == 54) {
                    this.a.aE = obtainStyledAttributes.getInt(54, 0);
                } else if (index == 44) {
                    this.a.a = obtainStyledAttributes.getInt(44, 0);
                } else if (index == 53) {
                    this.a.b = obtainStyledAttributes.getInt(53, 0);
                } else if (index == 38) {
                    this.a.c = obtainStyledAttributes.getInt(38, 0);
                } else if (index == 46) {
                    this.a.as = obtainStyledAttributes.getInt(46, 0);
                } else if (index == 40) {
                    this.a.d = obtainStyledAttributes.getInt(40, 0);
                } else if (index == 48) {
                    this.a.at = obtainStyledAttributes.getInt(48, 0);
                } else if (index == 42) {
                    this.a.au = obtainStyledAttributes.getFloat(42, 0.5f);
                } else if (index == 37) {
                    this.a.aw = obtainStyledAttributes.getFloat(37, 0.5f);
                } else if (index == 45) {
                    this.a.ay = obtainStyledAttributes.getFloat(45, 0.5f);
                } else if (index == 39) {
                    this.a.ax = obtainStyledAttributes.getFloat(39, 0.5f);
                } else if (index == 47) {
                    this.a.az = obtainStyledAttributes.getFloat(47, 0.5f);
                } else if (index == 51) {
                    this.a.av = obtainStyledAttributes.getFloat(51, 0.5f);
                } else if (index == 41) {
                    this.a.aC = obtainStyledAttributes.getInt(41, 2);
                } else if (index == 50) {
                    this.a.aD = obtainStyledAttributes.getInt(50, 2);
                } else if (index == 43) {
                    this.a.aA = obtainStyledAttributes.getDimensionPixelSize(43, 0);
                } else if (index == 52) {
                    this.a.aB = obtainStyledAttributes.getDimensionPixelSize(52, 0);
                } else if (index == 49) {
                    this.a.aF = obtainStyledAttributes.getInt(49, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.i = this.a;
        k();
    }

    @Override // defpackage.bom
    public final void b(bnd bndVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (bndVar != null) {
            bndVar.W(mode, size, mode2, size2);
            setMeasuredDimension(bndVar.aS, bndVar.aT);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // defpackage.bnv
    public final void c(bmw bmwVar, boolean z) {
        bmz bmzVar = this.a;
        int i = bmzVar.aN;
        if (i <= 0 && bmzVar.aO <= 0) {
            return;
        }
        if (z) {
            bmzVar.aP = bmzVar.aO;
            bmzVar.aQ = i;
        } else {
            bmzVar.aP = i;
            bmzVar.aQ = bmzVar.aO;
        }
    }

    @Override // defpackage.bnv, android.view.View
    protected final void onMeasure(int i, int i2) {
        b(this.a, i, i2);
    }

    public bnt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public bnt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
