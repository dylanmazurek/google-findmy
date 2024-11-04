package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bmw;
import defpackage.bmx;
import defpackage.bna;
import defpackage.bnb;
import defpackage.bne;
import defpackage.bnv;
import defpackage.bnx;
import defpackage.bny;
import defpackage.boh;
import defpackage.boi;
import defpackage.boj;
import defpackage.bol;
import defpackage.ce;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    final SparseArray a;
    public final ArrayList b;
    protected final bmx c;
    public int d;
    protected boolean e;
    public int f;
    public boh g;
    final bny h;
    private int i;
    private int j;
    private int k;
    private int l;
    private HashMap m;
    private final SparseArray n;

    public ConstraintLayout(Context context) {
        super(context);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new bmx();
        this.i = 0;
        this.d = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.e = true;
        this.f = 257;
        this.g = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.h = new bny(this, this);
        e(null, 0, 0);
    }

    private final void e(AttributeSet attributeSet, int i, int i2) {
        bmx bmxVar = this.c;
        bmxVar.ah = this;
        bny bnyVar = this.h;
        bmxVar.aH = bnyVar;
        bmxVar.a.g = bnyVar;
        this.a.put(getId(), this);
        this.g = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, bol.b, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.i = obtainStyledAttributes.getDimensionPixelOffset(16, this.i);
                } else if (index == 17) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(17, this.d);
                } else if (index == 14) {
                    this.j = obtainStyledAttributes.getDimensionPixelOffset(14, this.j);
                } else if (index == 15) {
                    this.k = obtainStyledAttributes.getDimensionPixelOffset(15, this.k);
                } else if (index == 113) {
                    this.f = obtainStyledAttributes.getInt(113, this.f);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(56, 0);
                    if (resourceId != 0) {
                        try {
                            ce.k(getContext(), resourceId, new SparseArray(), new SparseArray());
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(34, 0);
                    try {
                        boh bohVar = new boh();
                        this.g = bohVar;
                        bohVar.g(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.g = null;
                    }
                    this.l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.c.X(this.f);
    }

    private final void f() {
        this.e = true;
    }

    private final void g() {
        int i;
        int i2;
        bmw bmwVar;
        bmw bmwVar2;
        bmw bmwVar3;
        bmw bmwVar4;
        bnx bnxVar;
        bmw bmwVar5;
        int i3;
        int i4;
        float parseFloat;
        bnb bnbVar;
        bmw cS;
        String str;
        int d;
        bmw bmwVar6;
        String str2;
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        boolean z = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            bmw cS2 = cS(getChildAt(i5));
            if (cS2 != null) {
                cS2.t();
            }
        }
        if (isInEditMode) {
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    int id = childAt.getId();
                    Integer valueOf = Integer.valueOf(id);
                    if (resourceName instanceof String) {
                        if (this.m == null) {
                            this.m = new HashMap();
                        }
                        int indexOf = resourceName.indexOf("/");
                        if (indexOf != -1) {
                            str2 = resourceName.substring(indexOf + 1);
                        } else {
                            str2 = resourceName;
                        }
                        valueOf.getClass();
                        this.m.put(str2, Integer.valueOf(id));
                    }
                    int indexOf2 = resourceName.indexOf(47);
                    if (indexOf2 != -1) {
                        resourceName = resourceName.substring(indexOf2 + 1);
                    }
                    int id2 = childAt.getId();
                    if (id2 == 0) {
                        bmwVar6 = this.c;
                    } else {
                        View view = (View) this.a.get(id2);
                        if (view == null && (view = findViewById(id2)) != null && view != this && view.getParent() == this) {
                            onViewAdded(view);
                        }
                        if (view == this) {
                            bmwVar6 = this.c;
                        } else if (view == null) {
                            bmwVar6 = null;
                        } else {
                            bmwVar6 = ((bnx) view.getLayoutParams()).av;
                        }
                    }
                    bmwVar6.aj = resourceName;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.l != -1) {
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt2 = getChildAt(i7);
                if (childAt2.getId() == this.l && (childAt2 instanceof boi)) {
                    throw null;
                }
            }
        }
        boh bohVar = this.g;
        if (bohVar != null) {
            bohVar.m(this);
        }
        this.c.aJ.clear();
        int size = this.b.size();
        if (size > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                bnv bnvVar = (bnv) this.b.get(i8);
                if (bnvVar.isInEditMode()) {
                    bnvVar.h(bnvVar.f);
                }
                bnb bnbVar2 = bnvVar.i;
                if (bnbVar2 != null) {
                    bnbVar2.aK = 0;
                    Arrays.fill(bnbVar2.aJ, (Object) null);
                    for (int i9 = 0; i9 < bnvVar.d; i9++) {
                        int i10 = bnvVar.c[i9];
                        View a = a(i10);
                        if (a == null && (d = bnvVar.d(this, (str = (String) bnvVar.h.get(Integer.valueOf(i10))))) != 0) {
                            bnvVar.c[i9] = d;
                            bnvVar.h.put(Integer.valueOf(d), str);
                            a = a(d);
                        }
                        if (a != null && (cS = cS(a)) != (bnbVar = bnvVar.i) && cS != null) {
                            int i11 = bnbVar.aK + 1;
                            bmw[] bmwVarArr = bnbVar.aJ;
                            int length = bmwVarArr.length;
                            if (i11 > length) {
                                bnbVar.aJ = (bmw[]) Arrays.copyOf(bmwVarArr, length + length);
                            }
                            bmw[] bmwVarArr2 = bnbVar.aJ;
                            int i12 = bnbVar.aK;
                            bmwVarArr2[i12] = cS;
                            bnbVar.aK = i12 + 1;
                        }
                    }
                    bnvVar.i.Y();
                }
            }
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt3 = getChildAt(i13);
            if (childAt3 instanceof boj) {
                throw null;
            }
        }
        this.n.clear();
        this.n.put(0, this.c);
        this.n.put(getId(), this.c);
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt4 = getChildAt(i14);
            this.n.put(childAt4.getId(), cS(childAt4));
        }
        int i15 = 0;
        while (i15 < childCount) {
            View childAt5 = getChildAt(i15);
            bmw cS3 = cS(childAt5);
            if (cS3 != null) {
                bnx bnxVar2 = (bnx) childAt5.getLayoutParams();
                bmx bmxVar = this.c;
                bmxVar.aJ.add(cS3);
                bmw bmwVar7 = cS3.V;
                if (bmwVar7 != null) {
                    ((bne) bmwVar7).ab(cS3);
                }
                cS3.V = bmxVar;
                SparseArray sparseArray = this.n;
                bnxVar2.a();
                bnxVar2.aw = z;
                cS3.ai = childAt5.getVisibility();
                boolean z2 = bnxVar2.aj;
                cS3.ah = childAt5;
                if (childAt5 instanceof bnv) {
                    ((bnv) childAt5).c(cS3, this.c.c);
                }
                if (bnxVar2.ah) {
                    bna bnaVar = (bna) cS3;
                    int i16 = bnxVar2.as;
                    int i17 = bnxVar2.at;
                    float f = bnxVar2.au;
                    if (f != -1.0f) {
                        if (f > -1.0f) {
                            bnaVar.a = f;
                            bnaVar.b = -1;
                            bnaVar.c = -1;
                        }
                    } else if (i16 != -1) {
                        if (i16 >= 0) {
                            bnaVar.a = -1.0f;
                            bnaVar.b = i16;
                            bnaVar.c = -1;
                        }
                    } else if (i17 != -1 && i17 >= 0) {
                        bnaVar.a = -1.0f;
                        bnaVar.b = -1;
                        bnaVar.c = i17;
                    }
                } else {
                    int i18 = bnxVar2.al;
                    int i19 = bnxVar2.am;
                    int i20 = bnxVar2.an;
                    int i21 = bnxVar2.ao;
                    int i22 = bnxVar2.ap;
                    int i23 = bnxVar2.aq;
                    float f2 = bnxVar2.ar;
                    int i24 = bnxVar2.p;
                    if (i24 != -1) {
                        bmw bmwVar8 = (bmw) sparseArray.get(i24);
                        if (bmwVar8 != null) {
                            float f3 = bnxVar2.r;
                            cS3.R(7, bmwVar8, 7, bnxVar2.q, 0);
                            cS3.F = f3;
                        }
                        bnxVar = bnxVar2;
                        bmwVar5 = cS3;
                    } else {
                        if (i18 != -1) {
                            bmw bmwVar9 = (bmw) sparseArray.get(i18);
                            if (bmwVar9 != null) {
                                i = i23;
                                i2 = i21;
                                cS3.R(2, bmwVar9, 2, bnxVar2.leftMargin, i22);
                            } else {
                                i = i23;
                                i2 = i21;
                            }
                        } else {
                            i = i23;
                            i2 = i21;
                            if (i19 != -1 && (bmwVar = (bmw) sparseArray.get(i19)) != null) {
                                cS3.R(2, bmwVar, 4, bnxVar2.leftMargin, i22);
                            }
                        }
                        if (i20 != -1) {
                            bmw bmwVar10 = (bmw) sparseArray.get(i20);
                            if (bmwVar10 != null) {
                                cS3.R(4, bmwVar10, 2, bnxVar2.rightMargin, i);
                            }
                        } else if (i2 != -1 && (bmwVar2 = (bmw) sparseArray.get(i2)) != null) {
                            cS3.R(4, bmwVar2, 4, bnxVar2.rightMargin, i);
                        }
                        int i25 = bnxVar2.i;
                        if (i25 != -1) {
                            bmw bmwVar11 = (bmw) sparseArray.get(i25);
                            if (bmwVar11 != null) {
                                cS3.R(3, bmwVar11, 3, bnxVar2.topMargin, bnxVar2.x);
                            }
                        } else {
                            int i26 = bnxVar2.j;
                            if (i26 != -1 && (bmwVar3 = (bmw) sparseArray.get(i26)) != null) {
                                cS3.R(3, bmwVar3, 5, bnxVar2.topMargin, bnxVar2.x);
                            }
                        }
                        int i27 = bnxVar2.k;
                        if (i27 != -1) {
                            bmw bmwVar12 = (bmw) sparseArray.get(i27);
                            if (bmwVar12 != null) {
                                cS3.R(5, bmwVar12, 3, bnxVar2.bottomMargin, bnxVar2.z);
                            }
                        } else {
                            int i28 = bnxVar2.l;
                            if (i28 != -1 && (bmwVar4 = (bmw) sparseArray.get(i28)) != null) {
                                cS3.R(5, bmwVar4, 5, bnxVar2.bottomMargin, bnxVar2.z);
                            }
                        }
                        int i29 = bnxVar2.m;
                        if (i29 != -1) {
                            bnxVar = bnxVar2;
                            bmwVar5 = cS3;
                            h(cS3, bnxVar2, sparseArray, i29, 6);
                        } else {
                            bnxVar = bnxVar2;
                            bmwVar5 = cS3;
                            int i30 = bnxVar.n;
                            if (i30 != -1) {
                                h(bmwVar5, bnxVar, sparseArray, i30, 3);
                            } else {
                                int i31 = bnxVar.o;
                                if (i31 != -1) {
                                    h(bmwVar5, bnxVar, sparseArray, i31, 5);
                                }
                            }
                        }
                        if (f2 >= 0.0f) {
                            bmwVar5.af = f2;
                        }
                        float f4 = bnxVar.H;
                        if (f4 >= 0.0f) {
                            bmwVar5.ag = f4;
                        }
                    }
                    if (isInEditMode) {
                        int i32 = bnxVar.X;
                        if (i32 == -1) {
                            if (bnxVar.Y != -1) {
                                i32 = -1;
                            }
                        }
                        int i33 = bnxVar.Y;
                        bmwVar5.aa = i32;
                        bmwVar5.ab = i33;
                    }
                    if (!bnxVar.ae) {
                        if (bnxVar.width == -1) {
                            if (bnxVar.aa) {
                                bmwVar5.S(3);
                            } else {
                                bmwVar5.S(4);
                            }
                            bmwVar5.M(2).f = bnxVar.leftMargin;
                            bmwVar5.M(4).f = bnxVar.rightMargin;
                        } else {
                            bmwVar5.S(3);
                            bmwVar5.E(0);
                        }
                    } else {
                        bmwVar5.S(1);
                        bmwVar5.E(bnxVar.width);
                        if (bnxVar.width == -2) {
                            bmwVar5.S(2);
                        }
                    }
                    if (!bnxVar.af) {
                        if (bnxVar.height == -1) {
                            if (bnxVar.ab) {
                                bmwVar5.T(3);
                            } else {
                                bmwVar5.T(4);
                            }
                            bmwVar5.M(3).f = bnxVar.topMargin;
                            bmwVar5.M(5).f = bnxVar.bottomMargin;
                        } else {
                            bmwVar5.T(3);
                            bmwVar5.z(0);
                        }
                    } else {
                        bmwVar5.T(1);
                        bmwVar5.z(bnxVar.height);
                        if (bnxVar.height == -2) {
                            bmwVar5.T(2);
                        }
                    }
                    String str3 = bnxVar.I;
                    if (str3 != null && str3.length() != 0) {
                        int length2 = str3.length();
                        int indexOf3 = str3.indexOf(44);
                        if (indexOf3 > 0 && indexOf3 < length2 - 1) {
                            String substring = str3.substring(0, indexOf3);
                            if (substring.equalsIgnoreCase("W")) {
                                i4 = 0;
                            } else if (substring.equalsIgnoreCase("H")) {
                                i4 = 1;
                            } else {
                                i4 = -1;
                            }
                            i3 = indexOf3 + 1;
                        } else {
                            i3 = 0;
                            i4 = -1;
                        }
                        int indexOf4 = str3.indexOf(58);
                        if (indexOf4 >= 0 && indexOf4 < length2 - 1) {
                            String substring2 = str3.substring(i3, indexOf4);
                            String substring3 = str3.substring(indexOf4 + 1);
                            if (substring2.length() > 0 && substring3.length() > 0) {
                                try {
                                    float parseFloat2 = Float.parseFloat(substring2);
                                    float parseFloat3 = Float.parseFloat(substring3);
                                    if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                                        if (i4 == 1) {
                                            parseFloat = Math.abs(parseFloat3 / parseFloat2);
                                        } else {
                                            parseFloat = Math.abs(parseFloat2 / parseFloat3);
                                        }
                                    }
                                } catch (NumberFormatException unused2) {
                                }
                            }
                            parseFloat = 0.0f;
                        } else {
                            String substring4 = str3.substring(i3);
                            if (substring4.length() > 0) {
                                parseFloat = Float.parseFloat(substring4);
                            }
                            parseFloat = 0.0f;
                        }
                        if (parseFloat > 0.0f) {
                            bmwVar5.Y = parseFloat;
                            bmwVar5.Z = i4;
                        }
                    } else {
                        bmwVar5.Y = 0.0f;
                    }
                    float f5 = bnxVar.L;
                    float[] fArr = bmwVar5.am;
                    fArr[0] = f5;
                    fArr[1] = bnxVar.M;
                    bmwVar5.ak = bnxVar.N;
                    bmwVar5.al = bnxVar.O;
                    int i34 = bnxVar.ad;
                    if (i34 >= 0 && i34 <= 3) {
                        bmwVar5.s = i34;
                    }
                    int i35 = bnxVar.P;
                    int i36 = bnxVar.R;
                    int i37 = bnxVar.T;
                    float f6 = bnxVar.V;
                    bmwVar5.t = i35;
                    bmwVar5.w = i36;
                    if (i37 == Integer.MAX_VALUE) {
                        i37 = 0;
                    }
                    bmwVar5.x = i37;
                    bmwVar5.y = f6;
                    if (f6 > 0.0f && f6 < 1.0f && i35 == 0) {
                        bmwVar5.t = 2;
                    }
                    int i38 = bnxVar.Q;
                    int i39 = bnxVar.S;
                    int i40 = bnxVar.U;
                    float f7 = bnxVar.W;
                    bmwVar5.u = i38;
                    bmwVar5.z = i39;
                    if (i40 == Integer.MAX_VALUE) {
                        i40 = 0;
                    }
                    bmwVar5.A = i40;
                    bmwVar5.B = f7;
                    if (f7 > 0.0f && f7 < 1.0f && i38 == 0) {
                        bmwVar5.u = 2;
                    }
                    i15++;
                    z = false;
                }
            }
            i15++;
            z = false;
        }
    }

    private final void h(bmw bmwVar, bnx bnxVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.a.get(i);
        bmw bmwVar2 = (bmw) sparseArray.get(i);
        if (bmwVar2 != null && view != null && (view.getLayoutParams() instanceof bnx)) {
            bnxVar.ag = true;
            if (i2 == 6) {
                bnx bnxVar2 = (bnx) view.getLayoutParams();
                bnxVar2.ag = true;
                bnxVar2.av.G = true;
            }
            bmwVar.M(6).n(bmwVar2.M(i2), bnxVar.D, bnxVar.C, true);
            bmwVar.G = true;
            bmwVar.M(3).e();
            bmwVar.M(5).e();
        }
    }

    public final View a(int i) {
        return (View) this.a.get(i);
    }

    protected final boolean c() {
        if ((getContext().getApplicationInfo().flags & 4194304) != 0 && getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final bmw cS(View view) {
        if (view == this) {
            return this.c;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof bnx) {
                return ((bnx) view.getLayoutParams()).av;
            }
            view.setLayoutParams(new bnx(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof bnx) {
                return ((bnx) view.getLayoutParams()).av;
            }
            return null;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof bnx;
    }

    public final Object d(Object obj) {
        HashMap hashMap;
        if ((obj instanceof String) && (hashMap = this.m) != null && hashMap.containsKey(obj)) {
            return this.m.get(obj);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        int i3 = (int) ((parseInt2 / 1920.0f) * height);
                        int i4 = (int) ((parseInt / 1080.0f) * width);
                        float f = ((int) ((parseInt3 / 1080.0f) * width)) + i4;
                        float f2 = i4;
                        float f3 = i3;
                        canvas.drawLine(f2, f3, f, f3, paint);
                        float parseInt4 = i3 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f, f3, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f, f3, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        f();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new bnx();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new bnx(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            bnx bnxVar = (bnx) childAt.getLayoutParams();
            bmw bmwVar = bnxVar.av;
            if (childAt.getVisibility() == 8 && !bnxVar.ah && !bnxVar.ai) {
                boolean z2 = bnxVar.ak;
                if (!isInEditMode) {
                    continue;
                }
            }
            boolean z3 = bnxVar.aj;
            int k = bmwVar.k();
            int l = bmwVar.l();
            childAt.layout(k, l, bmwVar.j() + k, bmwVar.h() + l);
            if (childAt instanceof boj) {
                throw null;
            }
        }
        int size = this.b.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((bnv) this.b.get(i6)).l();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        boolean z = view instanceof Guideline;
        bmw cS = cS(view);
        if (z && !(cS instanceof bna)) {
            bnx bnxVar = (bnx) view.getLayoutParams();
            bnxVar.av = new bna();
            bnxVar.ah = true;
            ((bna) bnxVar.av).c(bnxVar.Z);
        }
        if (view instanceof bnv) {
            bnv bnvVar = (bnv) view;
            bnvVar.k();
            ((bnx) view.getLayoutParams()).ai = true;
            if (!this.b.contains(bnvVar)) {
                this.b.add(bnvVar);
            }
        }
        this.a.put(view.getId(), view);
        this.e = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.ab(cS(view));
        this.b.remove(view);
        this.e = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        f();
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setId(int i) {
        this.a.remove(getId());
        super.setId(i);
        this.a.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new bnx(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new bmx();
        this.i = 0;
        this.d = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.e = true;
        this.f = 257;
        this.g = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.h = new bny(this, this);
        e(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new bmx();
        this.i = 0;
        this.d = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.e = true;
        this.f = 257;
        this.g = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.h = new bny(this, this);
        e(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new bmx();
        this.i = 0;
        this.d = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.e = true;
        this.f = 257;
        this.g = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.h = new bny(this, this);
        e(attributeSet, i, i2);
    }
}
