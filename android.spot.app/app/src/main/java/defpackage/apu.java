package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class apu extends mpc implements mnw {
    public apu(Object obj) {
        super(0, obj, apv.class, "invalidateNodes", "invalidateNodes()V", 0);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [mnw, java.lang.Object] */
    @Override // defpackage.mnw
    public final /* synthetic */ Object a() {
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        char c;
        aiu aiuVar;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        Object[] objArr3;
        boolean z4;
        int i2;
        aiu aiuVar2;
        aiu aiuVar3;
        apv apvVar = (apv) this.c;
        sy syVar = (sy) apvVar.e;
        Object[] objArr4 = syVar.b;
        long[] jArr3 = syVar.a;
        int length = jArr3.length - 2;
        char c2 = 7;
        long j = -9187201950435737472L;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr3[i3];
                if ((((~j2) << c2) & j2 & j) != j) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((j2 & 255) < 128) {
                            aqb aqbVar = (aqb) objArr4[(i3 << 3) + i5];
                            if (aqbVar.bX().t) {
                                aow bX = aqbVar.bX();
                                aiu aiuVar4 = null;
                                while (bX != null) {
                                    if (bX instanceof aqh) {
                                        ((sy) apvVar.c).i((aqh) bX);
                                    } else if ((bX.l & 1024) != 0 && (bX instanceof axx)) {
                                        int i6 = 0;
                                        for (aow aowVar = ((axx) bX).d; aowVar != null; aowVar = aowVar.o) {
                                            if ((aowVar.l & 1024) != 0) {
                                                i6++;
                                                if (i6 == 1) {
                                                    bX = aowVar;
                                                } else {
                                                    if (aiuVar4 == null) {
                                                        aiuVar4 = new aiu(new aow[16]);
                                                    }
                                                    if (bX != null) {
                                                        aiuVar4.o(bX);
                                                    }
                                                    aiuVar4.o(aowVar);
                                                    bX = null;
                                                }
                                            }
                                        }
                                        if (i6 == 1) {
                                        }
                                    }
                                    bX = qg.d(aiuVar4);
                                }
                                if (aqbVar.bX().t) {
                                    aiu aiuVar5 = new aiu(new aow[16]);
                                    aow aowVar2 = aqbVar.bX().o;
                                    if (aowVar2 == null) {
                                        qg.h(aiuVar5, aqbVar.bX());
                                    } else {
                                        aiuVar5.o(aowVar2);
                                    }
                                    while (aiuVar5.m()) {
                                        aow aowVar3 = (aow) aiuVar5.b(aiuVar5.b - 1);
                                        if ((aowVar3.m & 1024) == 0) {
                                            qg.h(aiuVar5, aowVar3);
                                        } else {
                                            while (true) {
                                                if (aowVar3 == null) {
                                                    break;
                                                }
                                                if ((aowVar3.l & 1024) != 0) {
                                                    aiu aiuVar6 = null;
                                                    while (aowVar3 != null) {
                                                        if (aowVar3 instanceof aqh) {
                                                            ((sy) apvVar.c).i((aqh) aowVar3);
                                                        } else if ((aowVar3.l & 1024) != 0 && (aowVar3 instanceof axx)) {
                                                            aow aowVar4 = ((axx) aowVar3).d;
                                                            int i7 = 0;
                                                            while (aowVar4 != null) {
                                                                if ((aowVar4.l & 1024) != 0) {
                                                                    i7++;
                                                                    if (i7 == 1) {
                                                                        aiuVar3 = aiuVar5;
                                                                        aowVar3 = aowVar4;
                                                                    } else {
                                                                        if (aiuVar6 == null) {
                                                                            aiuVar3 = aiuVar5;
                                                                            aiuVar6 = new aiu(new aow[16]);
                                                                        } else {
                                                                            aiuVar3 = aiuVar5;
                                                                        }
                                                                        if (aowVar3 != null) {
                                                                            aiuVar6.o(aowVar3);
                                                                        }
                                                                        aiuVar6.o(aowVar4);
                                                                        aowVar3 = null;
                                                                    }
                                                                } else {
                                                                    aiuVar3 = aiuVar5;
                                                                }
                                                                aowVar4 = aowVar4.o;
                                                                aiuVar5 = aiuVar3;
                                                            }
                                                            aiuVar2 = aiuVar5;
                                                            if (i7 == 1) {
                                                                aiuVar5 = aiuVar2;
                                                            }
                                                            aowVar3 = qg.d(aiuVar6);
                                                            aiuVar5 = aiuVar2;
                                                        }
                                                        aiuVar2 = aiuVar5;
                                                        aowVar3 = qg.d(aiuVar6);
                                                        aiuVar5 = aiuVar2;
                                                    }
                                                } else {
                                                    aowVar3 = aowVar3.o;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                            } else {
                                continue;
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                c2 = 7;
                j = -9187201950435737472L;
            }
        }
        ((sy) apvVar.e).d();
        sy syVar2 = (sy) apvVar.d;
        Object[] objArr5 = syVar2.b;
        long[] jArr4 = syVar2.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j3 = jArr4[i8];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j3 & 255) < 128) {
                            axp axpVar = (axp) objArr5[(i8 << 3) + i10];
                            aow aowVar5 = axpVar.k;
                            if (!aowVar5.t) {
                                axpVar.z();
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                                c = '\b';
                                j3 >>= c;
                                i10++;
                                jArr4 = jArr2;
                                objArr5 = objArr2;
                            } else {
                                boolean z5 = true;
                                aqh aqhVar = null;
                                boolean z6 = false;
                                aiu aiuVar7 = null;
                                while (aowVar5 != null) {
                                    long[] jArr5 = jArr4;
                                    if (aowVar5 instanceof aqh) {
                                        aqh aqhVar2 = (aqh) aowVar5;
                                        if (aqhVar != null) {
                                            z3 = false;
                                        } else {
                                            z3 = true;
                                        }
                                        z6 |= !z3;
                                        if (((sy) apvVar.c).a(aqhVar2)) {
                                            ((sy) apvVar.f).i(aqhVar2);
                                            z5 = false;
                                        }
                                        objArr3 = objArr5;
                                        aqhVar = aqhVar2;
                                    } else {
                                        if ((aowVar5.l & 1024) != 0 && (aowVar5 instanceof axx)) {
                                            aow aowVar6 = ((axx) aowVar5).d;
                                            objArr3 = objArr5;
                                            int i11 = 0;
                                            while (aowVar6 != null) {
                                                boolean z7 = z5;
                                                if ((aowVar6.l & 1024) != 0) {
                                                    i11++;
                                                    if (i11 == 1) {
                                                        aowVar5 = aowVar6;
                                                    } else {
                                                        if (aiuVar7 == null) {
                                                            i2 = i11;
                                                            aiuVar7 = new aiu(new aow[16]);
                                                        } else {
                                                            i2 = i11;
                                                        }
                                                        if (aowVar5 != null) {
                                                            aiuVar7.o(aowVar5);
                                                        }
                                                        aiuVar7.o(aowVar6);
                                                        i11 = i2;
                                                        aowVar5 = null;
                                                    }
                                                }
                                                aowVar6 = aowVar6.o;
                                                z5 = z7;
                                            }
                                            z4 = z5;
                                            if (i11 == 1) {
                                                jArr4 = jArr5;
                                                objArr5 = objArr3;
                                                z5 = z4;
                                            }
                                        } else {
                                            objArr3 = objArr5;
                                            z4 = z5;
                                        }
                                        z5 = z4;
                                    }
                                    aowVar5 = qg.d(aiuVar7);
                                    jArr4 = jArr5;
                                    objArr5 = objArr3;
                                }
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                                boolean z8 = z5;
                                aow aowVar7 = axpVar.k;
                                if (aowVar7.t) {
                                    aiu aiuVar8 = new aiu(new aow[16]);
                                    aow aowVar8 = aowVar7.o;
                                    if (aowVar8 == null) {
                                        qg.h(aiuVar8, aowVar7);
                                    } else {
                                        aiuVar8.o(aowVar8);
                                    }
                                    boolean z9 = z8;
                                    while (aiuVar8.m()) {
                                        aow aowVar9 = (aow) aiuVar8.b(aiuVar8.b - 1);
                                        if ((aowVar9.m & 1024) == 0) {
                                            qg.h(aiuVar8, aowVar9);
                                        } else {
                                            while (aowVar9 != null) {
                                                if ((aowVar9.l & 1024) != 0) {
                                                    aiu aiuVar9 = null;
                                                    while (aowVar9 != null) {
                                                        if (aowVar9 instanceof aqh) {
                                                            aqh aqhVar3 = (aqh) aowVar9;
                                                            if (aqhVar != null) {
                                                                z2 = false;
                                                            } else {
                                                                z2 = true;
                                                            }
                                                            z6 |= !z2;
                                                            if (((sy) apvVar.c).a(aqhVar3)) {
                                                                ((sy) apvVar.f).i(aqhVar3);
                                                                z9 = false;
                                                            }
                                                            aqhVar = aqhVar3;
                                                        } else if ((aowVar9.l & 1024) != 0 && (aowVar9 instanceof axx)) {
                                                            aow aowVar10 = ((axx) aowVar9).d;
                                                            aiuVar = aiuVar8;
                                                            int i12 = 0;
                                                            while (aowVar10 != null) {
                                                                boolean z10 = z9;
                                                                if ((aowVar10.l & 1024) != 0) {
                                                                    i12++;
                                                                    if (i12 == 1) {
                                                                        aowVar9 = aowVar10;
                                                                    } else {
                                                                        if (aiuVar9 == null) {
                                                                            i = i12;
                                                                            aiuVar9 = new aiu(new aow[16]);
                                                                        } else {
                                                                            i = i12;
                                                                        }
                                                                        if (aowVar9 != null) {
                                                                            aiuVar9.o(aowVar9);
                                                                        }
                                                                        aiuVar9.o(aowVar10);
                                                                        i12 = i;
                                                                        aowVar9 = null;
                                                                        aowVar10 = aowVar10.o;
                                                                        z9 = z10;
                                                                    }
                                                                }
                                                                aowVar10 = aowVar10.o;
                                                                z9 = z10;
                                                            }
                                                            z = z9;
                                                            if (i12 == 1) {
                                                                aiuVar8 = aiuVar;
                                                                z9 = z;
                                                            }
                                                            aowVar9 = qg.d(aiuVar9);
                                                            aiuVar8 = aiuVar;
                                                            z9 = z;
                                                        }
                                                        aiuVar = aiuVar8;
                                                        z = z9;
                                                        aowVar9 = qg.d(aiuVar9);
                                                        aiuVar8 = aiuVar;
                                                        z9 = z;
                                                    }
                                                } else {
                                                    aowVar9 = aowVar9.o;
                                                    aiuVar8 = aiuVar8;
                                                }
                                            }
                                        }
                                        aiuVar8 = aiuVar8;
                                    }
                                    if (z9) {
                                        if (z6) {
                                            ft.i(axpVar);
                                        } else if (aqhVar != null) {
                                            aqhVar.c();
                                        }
                                        axpVar.z();
                                    }
                                } else {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                            }
                        } else {
                            jArr2 = jArr4;
                            objArr2 = objArr5;
                        }
                        c = '\b';
                        j3 >>= c;
                        i10++;
                        jArr4 = jArr2;
                        objArr5 = objArr2;
                    }
                    jArr = jArr4;
                    objArr = objArr5;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    objArr = objArr5;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                jArr4 = jArr;
                objArr5 = objArr;
            }
        }
        ((sy) apvVar.d).d();
        sy syVar3 = (sy) apvVar.c;
        Object[] objArr6 = syVar3.b;
        long[] jArr6 = syVar3.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i13 = 0;
            while (true) {
                long j4 = jArr6[i13];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length3)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j4 & 255) < 128) {
                            aqh aqhVar4 = (aqh) objArr6[(i13 << 3) + i15];
                            if (aqhVar4.t) {
                                aqf c3 = aqhVar4.c();
                                aqhVar4.f();
                                if (c3 != aqhVar4.c() || ((sy) apvVar.f).a(aqhVar4)) {
                                    ft.h(aqhVar4);
                                }
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length3) {
                    break;
                }
                i13++;
            }
        }
        ((sy) apvVar.c).d();
        ((sy) apvVar.f).d();
        apvVar.b.a();
        if (!((sy) apvVar.e).b()) {
            ll.g("Unprocessed FocusProperties nodes");
        }
        if (!((sy) apvVar.d).b()) {
            ll.g("Unprocessed FocusEvent nodes");
        }
        if (!((sy) apvVar.c).b()) {
            ll.g("Unprocessed FocusTarget nodes");
        }
        return mlh.a;
    }
}
