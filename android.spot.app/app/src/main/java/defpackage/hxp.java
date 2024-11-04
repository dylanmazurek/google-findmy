package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hxp implements hxr {
    private final /* synthetic */ int a;

    public /* synthetic */ hxp(int i) {
        this.a = i;
    }

    @Override // defpackage.hxr
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                return (String) obj;
            case 1:
                return Long.valueOf(Long.parseLong((String) obj));
            case 2:
                return Double.valueOf(Double.parseDouble((String) obj));
            case 3:
                return Boolean.valueOf(Boolean.parseBoolean((String) obj));
            case 4:
                return (String) obj;
            case 5:
                byte[] bArr = (byte[]) obj;
                gxf gxfVar = gxf.c;
                int length = bArr.length;
                lja ljaVar = lja.a;
                lkz lkzVar = lkz.a;
                ljn m = ljn.m(gxfVar, bArr, 0, length, lja.a);
                ljn.A(m);
                return (gxf) m;
            case 6:
                byte[] bArr2 = (byte[]) obj;
                gxe gxeVar = gxe.c;
                int length2 = bArr2.length;
                lja ljaVar2 = lja.a;
                lkz lkzVar2 = lkz.a;
                ljn m2 = ljn.m(gxeVar, bArr2, 0, length2, lja.a);
                ljn.A(m2);
                return (gxe) m2;
            case 7:
                byte[] bArr3 = (byte[]) obj;
                lix lixVar = lix.c;
                int length3 = bArr3.length;
                lja ljaVar3 = lja.a;
                lkz lkzVar3 = lkz.a;
                ljn m3 = ljn.m(lixVar, bArr3, 0, length3, lja.a);
                ljn.A(m3);
                return (lix) m3;
            case 8:
                byte[] bArr4 = (byte[]) obj;
                lmk lmkVar = lmk.b;
                int length4 = bArr4.length;
                lja ljaVar4 = lja.a;
                lkz lkzVar4 = lkz.a;
                ljn m4 = ljn.m(lmkVar, bArr4, 0, length4, lja.a);
                ljn.A(m4);
                return (lmk) m4;
            case 9:
                byte[] bArr5 = (byte[]) obj;
                gro groVar = gro.c;
                int length5 = bArr5.length;
                lja ljaVar5 = lja.a;
                lkz lkzVar5 = lkz.a;
                ljn m5 = ljn.m(groVar, bArr5, 0, length5, lja.a);
                ljn.A(m5);
                return (gro) m5;
            case 10:
                byte[] bArr6 = (byte[]) obj;
                nde ndeVar = nde.b;
                int length6 = bArr6.length;
                lja ljaVar6 = lja.a;
                lkz lkzVar6 = lkz.a;
                ljn m6 = ljn.m(ndeVar, bArr6, 0, length6, lja.a);
                ljn.A(m6);
                return (nde) m6;
            case 11:
                return mjo.M(obj);
            case 12:
                return mjo.M(obj);
            case 13:
                byte[] bArr7 = (byte[]) obj;
                hpr hprVar = hpr.f;
                int length7 = bArr7.length;
                lja ljaVar7 = lja.a;
                lkz lkzVar7 = lkz.a;
                ljn m7 = ljn.m(hprVar, bArr7, 0, length7, lja.a);
                ljn.A(m7);
                return (hpr) m7;
            case 14:
                byte[] bArr8 = (byte[]) obj;
                hqc hqcVar = hqc.e;
                int length8 = bArr8.length;
                lja ljaVar8 = lja.a;
                lkz lkzVar8 = lkz.a;
                ljn m8 = ljn.m(hqcVar, bArr8, 0, length8, lja.a);
                ljn.A(m8);
                return (hqc) m8;
            case 15:
                byte[] bArr9 = (byte[]) obj;
                hqb hqbVar = hqb.c;
                int length9 = bArr9.length;
                lja ljaVar9 = lja.a;
                lkz lkzVar9 = lkz.a;
                ljn m9 = ljn.m(hqbVar, bArr9, 0, length9, lja.a);
                ljn.A(m9);
                return (hqb) m9;
            case 16:
                byte[] bArr10 = (byte[]) obj;
                hrg hrgVar = hrg.d;
                int length10 = bArr10.length;
                lja ljaVar10 = lja.a;
                lkz lkzVar10 = lkz.a;
                ljn m10 = ljn.m(hrgVar, bArr10, 0, length10, lja.a);
                ljn.A(m10);
                return (hrg) m10;
            case 17:
                return mjo.M(obj);
            case 18:
                return mjo.M(obj);
            case 19:
                return mjo.M(obj);
            default:
                return mjo.M(obj);
        }
    }
}
