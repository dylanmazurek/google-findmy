package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.widget.R;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnx extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public int D;
    boolean E;
    boolean F;
    public float G;
    public float H;
    public String I;
    float J;
    int K;
    public float L;
    public float M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public float V;
    public float W;
    public int X;
    public int Y;
    public int Z;
    public int a;
    public boolean aa;
    public boolean ab;
    public String ac;
    public int ad;
    public boolean ae;
    public boolean af;
    public boolean ag;
    public boolean ah;
    public boolean ai;
    public boolean aj;
    public boolean ak;
    public int al;
    public int am;
    public int an;
    public int ao;
    public int ap;
    public int aq;
    public float ar;
    public int as;
    public int at;
    public float au;
    public bmw av;
    public boolean aw;
    public int b;
    public float c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public bnx() {
        super(-2, -2);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = true;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0.0f;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.y = Integer.MIN_VALUE;
        this.z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = 0;
        this.E = true;
        this.F = true;
        this.G = 0.5f;
        this.H = 0.5f;
        this.I = null;
        this.J = 0.0f;
        this.K = 1;
        this.L = -1.0f;
        this.M = -1.0f;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 1.0f;
        this.W = 1.0f;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.aa = false;
        this.ab = false;
        this.ac = null;
        this.ad = 0;
        this.ae = true;
        this.af = true;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.al = -1;
        this.am = -1;
        this.an = -1;
        this.ao = -1;
        this.ap = Integer.MIN_VALUE;
        this.aq = Integer.MIN_VALUE;
        this.ar = 0.5f;
        this.av = new bmw();
        this.aw = false;
    }

    public final void a() {
        this.ah = false;
        this.ae = true;
        this.af = true;
        if (this.width == -2 && this.aa) {
            this.ae = false;
            if (this.P == 0) {
                this.P = 1;
            }
        }
        if (this.height == -2 && this.ab) {
            this.af = false;
            if (this.Q == 0) {
                this.Q = 1;
            }
        }
        if (this.width == 0 || this.width == -1) {
            this.ae = false;
            if (this.width == 0 && this.P == 1) {
                this.width = -2;
                this.aa = true;
            }
        }
        if (this.height == 0 || this.height == -1) {
            this.af = false;
            if (this.height == 0 && this.Q == 1) {
                this.height = -2;
                this.ab = true;
            }
        }
        if (this.c == -1.0f && this.a == -1 && this.b == -1) {
            return;
        }
        this.ah = true;
        this.ae = true;
        this.af = true;
        if (!(this.av instanceof bna)) {
            this.av = new bna();
        }
        ((bna) this.av).c(this.Z);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0045  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void resolveLayoutDirection(int r11) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnx.resolveLayoutDirection(int):void");
    }

    public bnx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = true;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0.0f;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.y = Integer.MIN_VALUE;
        this.z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = 0;
        this.E = true;
        this.F = true;
        this.G = 0.5f;
        this.H = 0.5f;
        this.I = null;
        this.J = 0.0f;
        this.K = 1;
        this.L = -1.0f;
        this.M = -1.0f;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 1.0f;
        this.W = 1.0f;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.aa = false;
        this.ab = false;
        this.ac = null;
        this.ad = 0;
        this.ae = true;
        this.af = true;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.al = -1;
        this.am = -1;
        this.an = -1;
        this.ao = -1;
        this.ap = Integer.MIN_VALUE;
        this.aq = Integer.MIN_VALUE;
        this.ar = 0.5f;
        this.av = new bmw();
        this.aw = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bol.b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = bnw.a.get(index);
            switch (i2) {
                case 1:
                    this.Z = obtainStyledAttributes.getInt(index, this.Z);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.p);
                    this.p = resourceId;
                    if (resourceId == -1) {
                        this.p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    this.q = obtainStyledAttributes.getDimensionPixelSize(index, this.q);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, this.r) % 360.0f;
                    this.r = f;
                    if (f < 0.0f) {
                        this.r = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    this.a = obtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                    break;
                case 6:
                    this.b = obtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                    break;
                case 7:
                    this.c = obtainStyledAttributes.getFloat(index, this.c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, this.e);
                    this.e = resourceId2;
                    if (resourceId2 == -1) {
                        this.e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f);
                    this.f = resourceId3;
                    if (resourceId3 == -1) {
                        this.f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, this.g);
                    this.g = resourceId4;
                    if (resourceId4 == -1) {
                        this.g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, this.h);
                    this.h = resourceId5;
                    if (resourceId5 == -1) {
                        this.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, this.i);
                    this.i = resourceId6;
                    if (resourceId6 == -1) {
                        this.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId7;
                    if (resourceId7 == -1) {
                        this.j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, this.k);
                    this.k = resourceId8;
                    if (resourceId8 == -1) {
                        this.k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, this.l);
                    this.l = resourceId9;
                    if (resourceId9 == -1) {
                        this.l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, this.m);
                    this.m = resourceId10;
                    if (resourceId10 == -1) {
                        this.m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, this.s);
                    this.s = resourceId11;
                    if (resourceId11 == -1) {
                        this.s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, this.t);
                    this.t = resourceId12;
                    if (resourceId12 == -1) {
                        this.t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, this.u);
                    this.u = resourceId13;
                    if (resourceId13 == -1) {
                        this.u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, this.v);
                    this.v = resourceId14;
                    if (resourceId14 == -1) {
                        this.v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                    break;
                case 22:
                    this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                    break;
                case 23:
                    this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                    break;
                case R.styleable.TextInputLayout_cursorColor /* 24 */:
                    this.z = obtainStyledAttributes.getDimensionPixelSize(index, this.z);
                    break;
                case R.styleable.TextInputLayout_cursorErrorColor /* 25 */:
                    this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                    break;
                case R.styleable.TextInputLayout_endIconCheckable /* 26 */:
                    this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                    break;
                case R.styleable.TextInputLayout_endIconContentDescription /* 27 */:
                    this.aa = obtainStyledAttributes.getBoolean(index, this.aa);
                    break;
                case R.styleable.TextInputLayout_endIconDrawable /* 28 */:
                    this.ab = obtainStyledAttributes.getBoolean(index, this.ab);
                    break;
                case R.styleable.TextInputLayout_endIconMinSize /* 29 */:
                    this.G = obtainStyledAttributes.getFloat(index, this.G);
                    break;
                case R.styleable.TextInputLayout_endIconMode /* 30 */:
                    this.H = obtainStyledAttributes.getFloat(index, this.H);
                    break;
                case R.styleable.TextInputLayout_endIconScaleType /* 31 */:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    this.P = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case R.styleable.TextInputLayout_endIconTint /* 32 */:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    this.Q = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case R.styleable.TextInputLayout_endIconTintMode /* 33 */:
                    try {
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, this.R) == -2) {
                            this.R = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case R.styleable.TextInputLayout_errorAccessibilityLiveRegion /* 34 */:
                    try {
                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, this.T) == -2) {
                            this.T = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    this.V = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.V));
                    this.P = 2;
                    break;
                case R.styleable.TextInputLayout_errorEnabled /* 36 */:
                    try {
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, this.S) == -2) {
                            this.S = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case R.styleable.TextInputLayout_errorIconDrawable /* 37 */:
                    try {
                        this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, this.U) == -2) {
                            this.U = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case R.styleable.TextInputLayout_errorIconTint /* 38 */:
                    this.W = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.W));
                    this.Q = 2;
                    break;
                default:
                    switch (i2) {
                        case R.styleable.TextInputLayout_helperTextEnabled /* 44 */:
                            boh.j(this, obtainStyledAttributes.getString(index));
                            break;
                        case R.styleable.TextInputLayout_helperTextTextAppearance /* 45 */:
                            this.L = obtainStyledAttributes.getFloat(index, this.L);
                            break;
                        case R.styleable.TextInputLayout_helperTextTextColor /* 46 */:
                            this.M = obtainStyledAttributes.getFloat(index, this.M);
                            break;
                        case R.styleable.TextInputLayout_hintAnimationEnabled /* 47 */:
                            this.N = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case R.styleable.TextInputLayout_hintEnabled /* 48 */:
                            this.O = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case R.styleable.TextInputLayout_hintTextAppearance /* 49 */:
                            this.X = obtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                            break;
                        case R.styleable.TextInputLayout_hintTextColor /* 50 */:
                            this.Y = obtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                            break;
                        case R.styleable.TextInputLayout_passwordToggleContentDescription /* 51 */:
                            this.ac = obtainStyledAttributes.getString(index);
                            break;
                        case R.styleable.TextInputLayout_passwordToggleDrawable /* 52 */:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, this.n);
                            this.n = resourceId15;
                            if (resourceId15 == -1) {
                                this.n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.TextInputLayout_passwordToggleEnabled /* 53 */:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, this.o);
                            this.o = resourceId16;
                            if (resourceId16 == -1) {
                                this.o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.TextInputLayout_passwordToggleTint /* 54 */:
                            this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            break;
                        case R.styleable.TextInputLayout_passwordToggleTintMode /* 55 */:
                            this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                            break;
                        default:
                            switch (i2) {
                                case R.styleable.TextInputLayout_startIconCheckable /* 64 */:
                                    boh.i(this, obtainStyledAttributes, index, 0);
                                    this.E = true;
                                    break;
                                case R.styleable.TextInputLayout_startIconContentDescription /* 65 */:
                                    boh.i(this, obtainStyledAttributes, index, 1);
                                    this.F = true;
                                    break;
                                case R.styleable.TextInputLayout_startIconDrawable /* 66 */:
                                    this.ad = obtainStyledAttributes.getInt(index, this.ad);
                                    break;
                                case R.styleable.TextInputLayout_startIconMinSize /* 67 */:
                                    this.d = obtainStyledAttributes.getBoolean(index, this.d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        a();
    }

    public bnx(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = true;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0.0f;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.y = Integer.MIN_VALUE;
        this.z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = 0;
        this.E = true;
        this.F = true;
        this.G = 0.5f;
        this.H = 0.5f;
        this.I = null;
        this.J = 0.0f;
        this.K = 1;
        this.L = -1.0f;
        this.M = -1.0f;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 1.0f;
        this.W = 1.0f;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.aa = false;
        this.ab = false;
        this.ac = null;
        this.ad = 0;
        this.ae = true;
        this.af = true;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.al = -1;
        this.am = -1;
        this.an = -1;
        this.ao = -1;
        this.ap = Integer.MIN_VALUE;
        this.aq = Integer.MIN_VALUE;
        this.ar = 0.5f;
        this.av = new bmw();
        this.aw = false;
        if (layoutParams instanceof bnx) {
            bnx bnxVar = (bnx) layoutParams;
            this.a = bnxVar.a;
            this.b = bnxVar.b;
            this.c = bnxVar.c;
            this.d = bnxVar.d;
            this.e = bnxVar.e;
            this.f = bnxVar.f;
            this.g = bnxVar.g;
            this.h = bnxVar.h;
            this.i = bnxVar.i;
            this.j = bnxVar.j;
            this.k = bnxVar.k;
            this.l = bnxVar.l;
            this.m = bnxVar.m;
            this.n = bnxVar.n;
            this.o = bnxVar.o;
            this.p = bnxVar.p;
            this.q = bnxVar.q;
            this.r = bnxVar.r;
            this.s = bnxVar.s;
            this.t = bnxVar.t;
            this.u = bnxVar.u;
            this.v = bnxVar.v;
            this.w = bnxVar.w;
            this.x = bnxVar.x;
            this.y = bnxVar.y;
            this.z = bnxVar.z;
            this.A = bnxVar.A;
            this.B = bnxVar.B;
            this.C = bnxVar.C;
            this.D = bnxVar.D;
            this.G = bnxVar.G;
            this.H = bnxVar.H;
            this.I = bnxVar.I;
            this.J = bnxVar.J;
            this.K = bnxVar.K;
            this.L = bnxVar.L;
            this.M = bnxVar.M;
            this.N = bnxVar.N;
            this.O = bnxVar.O;
            this.aa = bnxVar.aa;
            this.ab = bnxVar.ab;
            this.P = bnxVar.P;
            this.Q = bnxVar.Q;
            this.R = bnxVar.R;
            this.T = bnxVar.T;
            this.S = bnxVar.S;
            this.U = bnxVar.U;
            this.V = bnxVar.V;
            this.W = bnxVar.W;
            this.X = bnxVar.X;
            this.Y = bnxVar.Y;
            this.Z = bnxVar.Z;
            this.ae = bnxVar.ae;
            this.af = bnxVar.af;
            this.ag = bnxVar.ag;
            this.ah = bnxVar.ah;
            this.al = bnxVar.al;
            this.am = bnxVar.am;
            this.an = bnxVar.an;
            this.ao = bnxVar.ao;
            this.ap = bnxVar.ap;
            this.aq = bnxVar.aq;
            this.ar = bnxVar.ar;
            this.ac = bnxVar.ac;
            this.ad = bnxVar.ad;
            this.av = bnxVar.av;
            this.E = bnxVar.E;
            this.F = bnxVar.F;
        }
    }
}
