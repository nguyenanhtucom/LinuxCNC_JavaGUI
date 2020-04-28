package de.schwarzrot.widgets;
/* 
 * **************************************************************************
 * 
 *  file:       AxisLetter.java
 *  project:    GUI for linuxcnc
 *  subproject: graphical application frontend
 *  purpose:    create a smart application, that assists in managing
 *              control of cnc-machines                           
 *  created:    15.9.2019 by Django Reinhard
 *  copyright:  all rights reserved
 * 
 *  This program is free software: you can redistribute it and/or modify 
 *  it under the terms of the GNU General Public License as published by 
 *  the Free Software Foundation, either version 2 of the License, or 
 *  (at your option) any later version. 
 *   
 *  This program is distributed in the hope that it will be useful, 
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of 
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the 
 *  GNU General Public License for more details. 
 *   
 *  You should have received a copy of the GNU General Public License 
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * **************************************************************************
 */


import java.awt.Dimension;

import javax.swing.JLabel;

import de.schwarzrot.bean.themes.UITheme;


public class AxisLetter extends JLabel {
   public AxisLetter(String axisName) {
      super(axisName);
      setFont(UITheme.getFont("Axis:font"));
      setHorizontalAlignment(JLabel.CENTER);
      setOpaque(true);
      setForeground(UITheme.getColor("Axis:foreground"));
      setBackground(UITheme.getColor("Axis:background"));

      //TODO: use fontmetrics of upcase W
      setMinimumSize(new Dimension(110, 60));
      setMaximumSize(new Dimension(110, 60));
   }


   private static final long serialVersionUID = 1L;
}