package defpackage;

import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hat extends has {
    final /* synthetic */ hau b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hat(hau hauVar) {
        super(hauVar);
        this.b = hauVar;
    }

    @Override // defpackage.has
    public final void a() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        this.b.l.setVisibility(0);
        hau.f(this.b.i);
        hau.f(this.b.j);
        hau hauVar = this.b;
        hauVar.i.setGravity(17);
        hauVar.j.setGravity(17);
        hauVar.k.setGravity(17);
        if (this.b.k.getVisibility() == 0) {
            hau.f(this.b.k);
            this.b.m.setVisibility(0);
        }
        hau hauVar2 = this.b;
        int[][] iArr = {new int[]{R.id.og_privacy_policy_button}, new int[]{R.id.og_separator1}, new int[]{R.id.og_tos_button}, new int[]{R.id.og_separator2}, new int[]{R.id.og_custom_button}};
        boh bohVar = new boh();
        bohVar.c(hauVar2);
        int i9 = 0;
        while (i9 < 5) {
            if (i9 == 0) {
                i5 = 0;
            } else {
                i5 = iArr[i9 - 1][0];
            }
            int i10 = i9 + 1;
            if (i9 == 4) {
                i6 = 0;
            } else {
                i6 = iArr[i10][0];
            }
            int i11 = iArr[i9][0];
            if (i5 == 0) {
                i7 = 3;
            } else {
                i7 = 4;
            }
            bohVar.n(i11, 3, i5, i7);
            if (i6 == 0) {
                i8 = 4;
            } else {
                i8 = 3;
            }
            bohVar.n(i11, 4, i6, i8);
            if (i5 != 0) {
                bohVar.n(i5, 4, i11, 3);
            }
            if (i6 != 0) {
                bohVar.n(i6, 3, i11, 4);
            }
            i9 = i10;
        }
        int i12 = 0;
        for (int i13 = 5; i12 < i13; i13 = 5) {
            int[] iArr2 = iArr[i12];
            int i14 = 0;
            while (true) {
                int length = iArr2.length;
                if (i14 < length) {
                    if (i14 == 0) {
                        i = 0;
                    } else {
                        i = iArr2[i14 - 1];
                    }
                    int i15 = i14 + 1;
                    if (i14 == length - 1) {
                        i2 = 0;
                    } else {
                        i2 = iArr2[i15];
                    }
                    int i16 = iArr2[i14];
                    if (i == 0) {
                        i3 = 6;
                    } else {
                        i3 = 7;
                    }
                    bohVar.n(i16, 6, i, i3);
                    if (i2 == 0) {
                        i4 = 7;
                    } else {
                        i4 = 6;
                    }
                    bohVar.n(i16, 7, i2, i4);
                    if (i != 0) {
                        bohVar.n(i, 7, i16, 6);
                    }
                    if (i2 != 0) {
                        bohVar.n(i2, 6, i16, 7);
                    }
                    if (i14 > 0) {
                        bohVar.f(iArr2[i14], 3, iArr2[0], 3);
                        bohVar.f(iArr2[i14], 4, iArr2[0], 4);
                    }
                    i14 = i15;
                }
            }
            i12++;
        }
        bohVar.b(hauVar2);
    }
}
