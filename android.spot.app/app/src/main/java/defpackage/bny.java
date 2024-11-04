package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bny {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    final /* synthetic */ ConstraintLayout h;

    public bny(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    private static final boolean b(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            if ((mode == Integer.MIN_VALUE || mode == 0) && i3 == size) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(bmw bmwVar, bnf bnfVar) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int baseline;
        int i;
        int i2;
        int i3;
        boolean z7;
        boolean z8;
        int i4;
        int i5;
        int i6;
        if (bmwVar != null) {
            if (bmwVar.ai != 8) {
                if (bmwVar.V != null) {
                    int i7 = bnfVar.i;
                    int i8 = bnfVar.j;
                    int i9 = bnfVar.a;
                    int i10 = bnfVar.b;
                    int i11 = this.b + this.c;
                    int i12 = this.d;
                    Object obj = bmwVar.ah;
                    int i13 = i7 - 1;
                    if (i7 != 0) {
                        if (i13 != 0) {
                            if (i13 != 1) {
                                if (i13 != 2) {
                                    if (i13 != 3) {
                                        makeMeasureSpec = 0;
                                    } else {
                                        int i14 = this.f;
                                        bmv bmvVar = bmwVar.K;
                                        if (bmvVar != null) {
                                            i6 = bmvVar.f;
                                        } else {
                                            i6 = 0;
                                        }
                                        bmv bmvVar2 = bmwVar.M;
                                        if (bmvVar2 != null) {
                                            i6 += bmvVar2.f;
                                        }
                                        makeMeasureSpec = ViewGroup.getChildMeasureSpec(i14, i12 + i6, -1);
                                    }
                                } else {
                                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i12, -2);
                                    int i15 = bmwVar.t;
                                    int i16 = bnfVar.h;
                                    if (i16 == 1 || i16 == 2) {
                                        int measuredHeight = ((View) obj).getMeasuredHeight();
                                        int h = bmwVar.h();
                                        if (bnfVar.h == 2 || i15 != 1 || measuredHeight == h || (obj instanceof boj) || bmwVar.e()) {
                                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(bmwVar.j(), 1073741824);
                                        }
                                    }
                                }
                            } else {
                                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i12, -2);
                            }
                        } else {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                        }
                        int i17 = i8 - 1;
                        if (i8 != 0) {
                            if (i17 != 0) {
                                if (i17 != 1) {
                                    if (i17 != 2) {
                                        if (i17 != 3) {
                                            makeMeasureSpec2 = 0;
                                        } else {
                                            int i18 = this.g;
                                            if (bmwVar.K != null) {
                                                i5 = bmwVar.L.f;
                                            } else {
                                                i5 = 0;
                                            }
                                            if (bmwVar.M != null) {
                                                i5 += bmwVar.N.f;
                                            }
                                            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i18, i11 + i5, -1);
                                        }
                                    } else {
                                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i11, -2);
                                        int i19 = bmwVar.u;
                                        int i20 = bnfVar.h;
                                        if (i20 == 1 || i20 == 2) {
                                            int measuredWidth = ((View) obj).getMeasuredWidth();
                                            int j = bmwVar.j();
                                            if (bnfVar.h == 2 || i19 != 1 || measuredWidth == j || (obj instanceof boj) || bmwVar.f()) {
                                                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(bmwVar.h(), 1073741824);
                                            }
                                        }
                                    }
                                } else {
                                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i11, -2);
                                }
                            } else {
                                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                            }
                            bmw bmwVar2 = bmwVar.V;
                            if (bmwVar2 != null && bnc.b(this.h.f, 256)) {
                                View view = (View) obj;
                                if (view.getMeasuredWidth() == bmwVar.j() && view.getMeasuredWidth() < bmwVar2.j() && view.getMeasuredHeight() == bmwVar.h() && view.getMeasuredHeight() < bmwVar2.h() && view.getBaseline() == bmwVar.ac && !bmwVar.L() && b(bmwVar.I, makeMeasureSpec, bmwVar.j()) && b(bmwVar.J, makeMeasureSpec2, bmwVar.h())) {
                                    bnfVar.c = bmwVar.j();
                                    bnfVar.d = bmwVar.h();
                                    bnfVar.e = bmwVar.ac;
                                    return;
                                }
                            }
                            if (i7 == 3) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (i8 == 3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (i8 != 4 && i8 != 1) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (i7 != 4 && i7 != 1) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (z && bmwVar.Y > 0.0f) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z2 && bmwVar.Y > 0.0f) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (obj != null) {
                                View view2 = (View) obj;
                                bnx bnxVar = (bnx) view2.getLayoutParams();
                                int i21 = bnfVar.h;
                                if (i21 != 1 && i21 != 2 && z && bmwVar.t == 0 && z2 && bmwVar.u == 0) {
                                    i3 = -1;
                                    baseline = 0;
                                    i = 0;
                                    i2 = 0;
                                } else {
                                    if ((obj instanceof bom) && (bmwVar instanceof bnd)) {
                                        ((bom) obj).b((bnd) bmwVar, makeMeasureSpec, makeMeasureSpec2);
                                    } else {
                                        view2.measure(makeMeasureSpec, makeMeasureSpec2);
                                    }
                                    bmwVar.B(makeMeasureSpec, makeMeasureSpec2);
                                    int measuredWidth2 = view2.getMeasuredWidth();
                                    int measuredHeight2 = view2.getMeasuredHeight();
                                    baseline = view2.getBaseline();
                                    int i22 = bmwVar.w;
                                    if (i22 > 0) {
                                        i = Math.max(i22, measuredWidth2);
                                    } else {
                                        i = measuredWidth2;
                                    }
                                    int i23 = bmwVar.x;
                                    if (i23 > 0) {
                                        i = Math.min(i23, i);
                                    }
                                    int i24 = bmwVar.z;
                                    if (i24 > 0) {
                                        i2 = Math.max(i24, measuredHeight2);
                                    } else {
                                        i2 = measuredHeight2;
                                    }
                                    int i25 = bmwVar.A;
                                    if (i25 > 0) {
                                        i2 = Math.min(i25, i2);
                                    }
                                    if (!bnc.b(this.h.f, 1)) {
                                        if (z5 && z3) {
                                            i = (int) ((i2 * bmwVar.Y) + 0.5f);
                                        } else if (z6 && z4) {
                                            i2 = (int) ((i / bmwVar.Y) + 0.5f);
                                        }
                                    }
                                    if (measuredWidth2 != i || measuredHeight2 != i2) {
                                        if (measuredWidth2 != i) {
                                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
                                        }
                                        if (measuredHeight2 != i2) {
                                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
                                        }
                                        view2.measure(makeMeasureSpec, makeMeasureSpec2);
                                        bmwVar.B(makeMeasureSpec, makeMeasureSpec2);
                                        i = view2.getMeasuredWidth();
                                        i2 = view2.getMeasuredHeight();
                                        baseline = view2.getBaseline();
                                    }
                                    i3 = -1;
                                }
                                if (baseline == i3) {
                                    z7 = false;
                                } else {
                                    z7 = true;
                                }
                                if (i == bnfVar.a && i2 == bnfVar.b) {
                                    z8 = false;
                                } else {
                                    z8 = true;
                                }
                                bnfVar.g = z8;
                                boolean z9 = z7 | bnxVar.ag;
                                if (z9) {
                                    if (baseline != -1) {
                                        if (bmwVar.ac != baseline) {
                                            bnfVar.g = true;
                                        }
                                    } else {
                                        i4 = -1;
                                        bnfVar.c = i;
                                        bnfVar.d = i2;
                                        bnfVar.f = z9;
                                        bnfVar.e = i4;
                                        return;
                                    }
                                }
                                i4 = baseline;
                                bnfVar.c = i;
                                bnfVar.d = i2;
                                bnfVar.f = z9;
                                bnfVar.e = i4;
                                return;
                            }
                            return;
                        }
                        throw null;
                    }
                    throw null;
                }
                return;
            }
            bnfVar.c = 0;
            bnfVar.d = 0;
            bnfVar.e = 0;
        }
    }
}
