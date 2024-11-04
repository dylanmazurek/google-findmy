package com.google.android.gms.people.account.categories;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.ful;
import defpackage.fvf;
import defpackage.fvg;
import defpackage.ivc;
import defpackage.jeq;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ClassifyAccountTypeResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ful(16);
    public final String a;
    public final String b;
    private final fvf c;
    private final fvg d;

    public ClassifyAccountTypeResult(String str, String str2, int i, int i2) {
        fvf fvfVar;
        this.a = str;
        this.b = str2;
        fvg fvgVar = null;
        switch (i) {
            case 0:
                fvfVar = fvf.UNKNOWN;
                break;
            case 1:
                fvfVar = fvf.NULL_ACCOUNT;
                break;
            case 2:
                fvfVar = fvf.GOOGLE;
                break;
            case 3:
                fvfVar = fvf.DEVICE;
                break;
            case 4:
                fvfVar = fvf.SIM;
                break;
            case 5:
                fvfVar = fvf.EXCHANGE;
                break;
            case 6:
                fvfVar = fvf.THIRD_PARTY_EDITABLE;
                break;
            case 7:
                fvfVar = fvf.THIRD_PARTY_READONLY;
                break;
            case 8:
                fvfVar = fvf.SIM_SDN;
                break;
            case 9:
                fvfVar = fvf.PRELOAD_SDN;
                break;
            default:
                fvfVar = null;
                break;
        }
        this.c = fvfVar == null ? fvf.UNKNOWN : fvfVar;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                fvgVar = fvg.SHEEPDOG_ELIGIBLE;
                            }
                        } else {
                            fvgVar = fvg.HEURISTIC;
                        }
                    } else {
                        fvgVar = fvg.SUBSTRING;
                    }
                } else {
                    fvgVar = fvg.EXACT;
                }
            } else {
                fvgVar = fvg.NONE;
            }
        } else {
            fvgVar = fvg.UNKNOWN;
        }
        this.d = fvgVar == null ? fvg.UNKNOWN : fvgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ClassifyAccountTypeResult classifyAccountTypeResult = (ClassifyAccountTypeResult) obj;
            if (amr.g(this.a, classifyAccountTypeResult.a) && amr.g(this.b, classifyAccountTypeResult.b) && this.c == classifyAccountTypeResult.c && this.d == classifyAccountTypeResult.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("accountType", this.a);
        q.b("dataSet", this.b);
        q.b("category", this.c);
        q.b("matchTag", this.d);
        return q.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int D = fma.D(parcel);
        fma.X(parcel, 1, str);
        fma.X(parcel, 2, this.b);
        fma.L(parcel, 3, this.c.k);
        fma.L(parcel, 4, this.d.g);
        fma.F(parcel, D);
    }
}
