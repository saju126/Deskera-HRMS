/*
 * Copyright (C) 2012  Krawler Information Systems Pvt Ltd
 * All rights reserved.
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
*/
package masterDB;
// Generated Jul 1, 2009 2:58:39 PM by Hibernate Tools 3.2.1.GA

/**
 * Templatemapdeduction generated by hbm2java
 */
public class TempTemplateMagDeduction implements java.io.Serializable {

    private String id;
    private Template template;
    private Deductionmaster deductionmaster;
    private String rate;

    public TempTemplateMagDeduction() {
    }

    public TempTemplateMagDeduction(String id, Template template, Deductionmaster deductionmaster) {
        this.id = id;
        this.template = template;
        this.deductionmaster = deductionmaster;
    }

    public TempTemplateMagDeduction(String id, Template template, Deductionmaster deductionmaster, String rate) {
        this.id = id;
        this.template = template;
        this.deductionmaster = deductionmaster;
        this.rate = rate;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Template getTemplate() {
        return this.template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public Deductionmaster getDeductionmaster() {
        return this.deductionmaster;
    }

    public void setDeductionmaster(Deductionmaster deductionmaster) {
        this.deductionmaster = deductionmaster;
    }

    public String getRate() {
        return this.rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}


