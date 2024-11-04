package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecw extends ecs {
    public ebf af;
    public dhx ag;
    private ProgressBar ah;
    private TextView ai;
    private TextView aj;
    private TextView ak;
    private TextView al;
    private Button am;
    private View an;
    private View ao;
    public ecz c;
    public evo d;
    public ena e;
    public boolean a = false;
    ezf b = null;

    private final boolean aF() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public static ecw d(lqd lqdVar) {
        Bundle bundle = new Bundle();
        eyf.m(lqdVar, bundle);
        ecw ecwVar = new ecw();
        ecwVar.ak(bundle);
        return ecwVar;
    }

    private final void q() {
        ezf ezfVar = this.b;
        if (ezfVar != null) {
            ezfVar.b = null;
            ezfVar.c = null;
            if (!ezfVar.d) {
                ezfVar.cancel();
                ezfVar.onTick(ezfVar.a);
                ezfVar.e = null;
            }
            this.b = null;
        }
    }

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_ring_device, viewGroup, false);
        this.ah = (ProgressBar) inflate.findViewById(R.id.progressbar);
        this.ai = (TextView) inflate.findViewById(R.id.elapsed_time);
        this.aj = (TextView) inflate.findViewById(R.id.total_time);
        this.ak = (TextView) inflate.findViewById(R.id.ring_text_section_1);
        TextView textView = (TextView) inflate.findViewById(R.id.ring_text_section_2);
        this.al = textView;
        textView.setVisibility(8);
        Button button = (Button) inflate.findViewById(R.id.btn_stop_ring);
        this.am = button;
        button.setVisibility(8);
        this.am.setOnClickListener(new he(this, 20, null));
        this.an = inflate.findViewById(R.id.timer_divider);
        this.ao = inflate.findViewById(R.id.btn_divider);
        inflate.addOnLayoutChangeListener(new ecu(this, 0));
        return inflate;
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        ((cfk) this.ag.a).g(O(), new qk(this, 16));
        this.c.a().g(O(), new qk(this, 17));
    }

    public final void e(int i) {
        o(new evh(i));
    }

    @Override // defpackage.ecs, defpackage.ag
    public final void f(Context context) {
        super.f(context);
        F().c().b(this, new ecv(this));
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.e.g(this.ad, eyf.g(A()));
        ecz eczVar = (ecz) new ddh((cgq) this).q(ecz.class);
        this.c = eczVar;
        eczVar.b();
    }

    @Override // defpackage.ag
    public final void k() {
        super.k();
        eda edaVar = (eda) this.c.a().d();
        if (edaVar != null) {
            p(edaVar);
        }
    }

    @Override // defpackage.ag
    public final void l() {
        q();
        super.l();
    }

    public final void o(evh evhVar) {
        if (ltu.f()) {
            return;
        }
        this.d.e(F(), evhVar);
    }

    public final void p(eda edaVar) {
        boolean z;
        boolean z2;
        ecy d = bsd.d(edaVar);
        String str = d.c;
        if (str.isEmpty()) {
            this.ak.setVisibility(8);
        } else {
            this.ak.setVisibility(0);
            this.ak.setText(str);
        }
        if (!edaVar.b) {
            this.al.setVisibility(8);
        } else {
            this.al.setVisibility(0);
            String T = T(R.string.ring_device_message_title_2);
            String T2 = T(R.string.ring_device_message_body_2);
            SpannableString spannableString = new SpannableString(T);
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            this.al.setText(spannableString);
            this.al.append(new SpannableString(" "));
            this.al.append(T2);
        }
        int i = edaVar.g;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        this.a = z;
        boolean z3 = edaVar.a;
        if (z3) {
            if (i == 1) {
                e(R.string.stop_ring_result_success);
                H().L();
                return;
            } else {
                this.am.setVisibility(0);
                this.am.setText(d.a);
                this.am.setEnabled(d.d);
            }
        } else {
            this.am.setVisibility(8);
            ProgressBar progressBar = this.ah;
            if (i != 2 && i != 3) {
                z2 = false;
            } else {
                z2 = true;
            }
            progressBar.setIndeterminate(z2);
        }
        if (edaVar.d.g() && edaVar.e.g() && d.e.g() && ((Long) edaVar.e.c()).longValue() > SystemClock.elapsedRealtime()) {
            if (!aF()) {
                e(R.string.ringing);
                if (z3) {
                    this.aj.setVisibility(0);
                    long longValue = ((Long) edaVar.d.c()).longValue();
                    long longValue2 = ((Long) edaVar.e.c()).longValue();
                    q();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    ezf ezfVar = new ezf(elapsedRealtime - longValue, longValue2 - elapsedRealtime);
                    this.b = ezfVar;
                    ProgressBar progressBar2 = this.ah;
                    TextView textView = this.ai;
                    TextView textView2 = this.aj;
                    progressBar2.getClass();
                    textView.getClass();
                    textView2.getClass();
                    ezfVar.b = progressBar2;
                    ezfVar.c = textView;
                    textView2.setText(ezfVar.a(0L));
                    if (ezfVar.d) {
                        ezfVar.onFinish();
                    }
                    ezf ezfVar2 = this.b;
                    ezfVar2.e = this;
                    ezfVar2.d = false;
                    ezfVar2.start();
                    Integer num = (Integer) d.e.c();
                    fma.bQ(y(), this.aj, this.ai.getResources().getQuantityString(R.plurals.content_desc_ring_device, num.intValue(), num));
                    if (edaVar.b) {
                        Context y = y();
                        TextView textView3 = this.al;
                        fma.bQ(y, textView3, String.valueOf(d.c).concat(String.valueOf(String.valueOf(textView3.getText()))));
                    } else if (!d.c.isEmpty()) {
                        fma.bQ(y(), this.ak, d.c);
                    }
                }
            }
        } else {
            if (aF()) {
                q();
            }
            if (z3) {
                this.aj.setVisibility(8);
                jer jerVar = edaVar.f;
                if (jerVar.g()) {
                    TextView textView4 = this.ai;
                    ((Integer) jerVar.c()).intValue();
                    textView4.setText(R.string.connecting);
                } else {
                    this.ai.setText("");
                }
            }
        }
        if (z3) {
            this.ao.setVisibility(0);
        } else {
            this.ao.setVisibility(8);
        }
        if ((this.ak.getVisibility() != 8 && this.ak.getText().length() != 0) || (this.al.getVisibility() != 8 && this.al.getText().length() != 0)) {
            this.an.setVisibility(0);
        } else {
            this.an.setVisibility(8);
            this.ao.setVisibility(8);
        }
    }
}
