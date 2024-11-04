package defpackage;

import android.accounts.Account;
import android.widget.TextView;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edj implements mww {
    final /* synthetic */ edl a;

    public edj(edl edlVar) {
        this.a = edlVar;
    }

    @Override // defpackage.mww
    public final /* synthetic */ Object dt(Object obj, mmx mmxVar) {
        lpw lpwVar;
        edz edzVar;
        lqc lqcVar;
        edz edzVar2;
        final lqc lqcVar2;
        lpw lpwVar2;
        long j;
        lpw lpwVar3;
        lps lpsVar;
        lpw lpwVar4;
        elo eloVar;
        eds edsVar = (eds) obj;
        String str = edsVar.a.g;
        final edl edlVar = this.a;
        edlVar.p(str);
        edlVar.o(edsVar.a);
        lqc lqcVar3 = edsVar.a;
        if (lqcVar3.b == 10) {
            lpwVar = (lpw) lqcVar3.c;
        } else {
            lpwVar = lpw.i;
        }
        lpwVar.getClass();
        eeb eebVar = edsVar.b;
        jis jisVar = null;
        if (eebVar instanceof eea) {
            lqc lqcVar4 = edsVar.a;
            eiv eivVar = ((eea) eebVar).a;
            TextView textView = ((ecr) edlVar).a;
            elo eloVar2 = edlVar.az;
            if (eloVar2 == null) {
                mpd.b("spotDeviceStateTextHelper");
                eloVar = null;
            } else {
                eloVar = eloVar2;
            }
            textView.setText(eloVar.d(lqcVar4, kyh.DEVICE_COMPONENT_UNSPECIFIED, eivVar, eis.NOT_IN_RANGE, edlVar.y()));
        } else if (!lpwVar.g) {
            TextView textView2 = ((ecr) edlVar).a;
            textView2.getClass();
            textView2.setText((CharSequence) null);
            textView2.append(btw.a(edlVar.T(R.string.location_history_opted_out), 0));
            textView2.append("\n");
            String T = edlVar.T(R.string.location_history);
            T.getClass();
            fma.bB(textView2, kvw.c(edlVar.U(R.string.enable_location_history, T), iqg.c(textView2, android.R.attr.textColorSecondary)), kvw.c(T, iqg.c(textView2, R.attr.colorPrimary)), -1, new ezj() { // from class: edg
                @Override // defpackage.ezj
                public final void a() {
                    edl edlVar2 = edl.this;
                    evy evyVar = edlVar2.ao;
                    mlh mlhVar = null;
                    pf pfVar = null;
                    if (evyVar == null) {
                        mpd.b("accountsState");
                        evyVar = null;
                    }
                    Account b = evyVar.b();
                    if (b != null) {
                        pf pfVar2 = edlVar2.as;
                        if (pfVar2 == null) {
                            mpd.b("enableLocationHistoryActivityResultLauncher");
                        } else {
                            pfVar = pfVar2;
                        }
                        pfVar.b(b);
                        mlhVar = mlh.a;
                    }
                    if (mlhVar == null) {
                        ((jni) edl.am.f().j("com/google/android/apps/adm/integrations/accessory/AccessoryDevicePanelFragment", "showLastKnownLocationOffStatus$lambda$3", 217, "AccessoryDevicePanelFragment.kt")).r("Account is missing for obtaining location history.");
                    }
                }
            });
        } else {
            int i = lpwVar.a;
            if ((i & 8) != 0) {
                if ((i & 1) != 0) {
                    if (eebVar instanceof edz) {
                        edzVar = (edz) eebVar;
                    } else {
                        edzVar = null;
                    }
                    if (edzVar != null) {
                        lqcVar = edzVar.b;
                    } else {
                        lqcVar = null;
                    }
                    if (lqcVar != null) {
                        TextView textView3 = ((ecr) edlVar).a;
                        textView3.getClass();
                        if (eebVar != null && (lqcVar2 = (edzVar2 = (edz) eebVar).b) != null) {
                            lqc lqcVar5 = edsVar.a;
                            if (lqcVar5.b == 10) {
                                lpwVar2 = (lpw) lqcVar5.c;
                            } else {
                                lpwVar2 = lpw.i;
                            }
                            lpwVar2.getClass();
                            if ((lpwVar2.a & 16) != 0) {
                                j = lpwVar2.f;
                            } else {
                                j = lpwVar2.e;
                            }
                            if (edzVar2.c) {
                                String T2 = edlVar.T(R.string.accessory_status_this_device);
                                T2.getClass();
                                textView3.setText(edlVar.aI(T2, j, edzVar2.a));
                            } else {
                                String str2 = lqcVar2.g;
                                str2.getClass();
                                if (str2.length() != 0) {
                                    textView3.setText((CharSequence) null);
                                    fma.bB(textView3, kvw.c(edlVar.aI(str2, j, edzVar2.a), iqg.c(textView3, android.R.attr.textColorSecondary)), kvw.c(str2, iqg.c(textView3, R.attr.colorPrimary)), 1, new ezj() { // from class: edi
                                        @Override // defpackage.ezj
                                        public final void a() {
                                            edl edlVar2 = edl.this;
                                            edv edvVar = edlVar2.ar;
                                            if (edvVar == null) {
                                                mpd.b("viewModel");
                                                edvVar = null;
                                            }
                                            lqc lqcVar6 = lqcVar2;
                                            ebf aK = edlVar2.aK();
                                            aK.getClass();
                                            aK.s();
                                            edvVar.f.e(lqcVar6);
                                        }
                                    });
                                }
                            }
                        }
                    }
                }
                ((ecr) edlVar).a.setText(edlVar.T(R.string.device_status_location_unavailable));
            } else {
                ((ecr) edlVar).a.setText(edlVar.T(R.string.accessory_status_no_connection_information));
            }
        }
        lqc lqcVar6 = edsVar.a;
        if (lqcVar6.b == 10) {
            lpwVar3 = (lpw) lqcVar6.c;
        } else {
            lpwVar3 = lpw.i;
        }
        if ((lpwVar3.a & 4) != 0) {
            if (lqcVar6.b == 10) {
                lpwVar4 = (lpw) lqcVar6.c;
            } else {
                lpwVar4 = lpw.i;
            }
            int i2 = lpwVar4.d;
            ljh k = lok.e.k();
            if (!k.b.y()) {
                k.t();
            }
            ljn ljnVar = k.b;
            lok lokVar = (lok) ljnVar;
            lokVar.a |= 2;
            lokVar.b = i2;
            if (!ljnVar.y()) {
                k.t();
            }
            lok.c((lok) k.b);
            edlVar.q((lok) k.q());
        } else {
            edlVar.q(null);
        }
        if (edsVar.c) {
            edlVar.aG();
        } else {
            edlVar.aF();
        }
        eeb eebVar2 = edsVar.b;
        if (eebVar2 != null) {
            lpsVar = bse.g(eebVar2);
        } else {
            lpsVar = null;
        }
        if (lpsVar != null) {
            ecq ecqVar = edlVar.at;
            if (ecqVar == null) {
                mpd.b("getDirectionsButton");
                ecqVar = null;
            }
            ecqVar.b();
            dyr aJ = edlVar.aJ();
            lqc lqcVar7 = edsVar.a;
            dxw a = dya.a();
            a.a = new dxr(eyf.x(lqcVar7));
            a.c(lpsVar);
            aJ.f(a.a());
        } else {
            edlVar.aJ().d();
            ecq ecqVar2 = edlVar.at;
            if (ecqVar2 == null) {
                mpd.b("getDirectionsButton");
                ecqVar2 = null;
            }
            ecqVar2.a();
        }
        jis jisVar2 = edlVar.au;
        if (jisVar2 == null) {
            mpd.b("buttons");
        } else {
            jisVar = jisVar2;
        }
        edlVar.e(jisVar);
        return mlh.a;
    }
}
